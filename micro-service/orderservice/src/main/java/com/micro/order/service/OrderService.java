package com.micro.order.service;

import com.micro.order.dto.OrderLineItemsDto;
import com.micro.order.dto.OrderRequest;
import com.micro.order.model.OrderLineItems;
import com.micro.order.model.Orders;
import com.micro.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Orders orders = new Orders();
        orders.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest
                .getOrderLineItemsListDto()
                .stream()
                .filter(Objects::nonNull)
                .map(this::mapToOrderLineItem).toList();
        orders.setOrderLineItemsList(orderLineItems);

        orderRepository.save(orders);
    }

    private OrderLineItems mapToOrderLineItem(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        return orderLineItems;
    }
}
