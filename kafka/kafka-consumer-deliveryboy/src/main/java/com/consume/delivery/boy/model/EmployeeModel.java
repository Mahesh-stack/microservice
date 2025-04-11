package com.consume.delivery.boy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeModel {

    private Integer id;
    private String name;
    private String desg;
    private String location;
}
