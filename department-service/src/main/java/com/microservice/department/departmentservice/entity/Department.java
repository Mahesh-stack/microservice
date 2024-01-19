package com.microservice.department.departmentservice.entity;


import lombok.*;

import java.util.List;

//@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Table(name = "Department")
public class Department {

  //  @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Employee> employees;
}
