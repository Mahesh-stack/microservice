package com.micro.product.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductRequest {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
