package com.microservice.department.departmentservice.controller;

import com.microservice.department.departmentservice.entity.Department;
import com.microservice.department.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService service;
    @PostMapping("/add-department")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department){
        return ResponseEntity.ok(service.addNewDepartment(department));
    }

}
