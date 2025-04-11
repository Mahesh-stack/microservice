package com.practice.emp.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;

@Entity
@Table(name = "Employee_Info")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_ID")
    private Integer id;
    @Column(name = "Employee_Name")
    private String name;
    @Column(name = "Employee_Salary")
    private BigDecimal salary;
    @Column(name = "Employee_Designation")
    private String desg;
}
