package com.micro.order.service;

import com.micro.order.dto.InventoryResponse;
import com.micro.order.dto.OrderLineItemsDto;
import com.micro.order.dto.OrderRequest;
import com.micro.order.model.OrderLineItems;
import com.micro.order.model.Orders;
import com.micro.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    private final WebClient webClient;

    public void placeOrder(OrderRequest orderRequest) {
        Orders orders = new Orders();
        orders.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest
                .getOrderLineItemsListDto()
                .stream()
                .filter(Objects::nonNull)
                .map(this::mapToOrderLineItem).toList();
        orders.setOrderLineItemsList(orderLineItems);

        List<String> skuCodes =
                orders.getOrderLineItemsList()
                        .stream()
                        .map(OrderLineItems::getSkuCode).toList();

        //Call Inventory Service and place order if product is in stock
        InventoryResponse[] inventoryResponsesArray =
                webClient.get()
                        .uri("http://localhost:8082/api/inventory",
                                uriBuilder -> uriBuilder.queryParam("skuCode", skuCodes)
                                        .build())
                        .retrieve()
                        .bodyToMono(InventoryResponse[].class).block();

        assert inventoryResponsesArray != null;
        boolean allProductInStocks = Arrays.stream(inventoryResponsesArray).allMatch(InventoryResponse::isInStock);

        if (allProductInStocks) {
            orderRepository.save(orders);
        } else {
            throw new IllegalArgumentException("Product is not in stock, please try again later");
        }

    }

    private OrderLineItems mapToOrderLineItem(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        return orderLineItems;
    }
}
