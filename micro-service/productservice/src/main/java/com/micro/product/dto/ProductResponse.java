package com.micro.product.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {

    //Good practice, Never exposed your entity for outside world so seperate it using dto
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
