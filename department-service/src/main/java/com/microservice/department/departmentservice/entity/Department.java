package com.microservice.department.departmentservice.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String departmentName;
    private String departmentLocation;
    private String departmentCode;
}
