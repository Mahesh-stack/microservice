package com.md.employee_service.controller;


import com.md.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    ResponseEntity<Map<String, Object>> getEmployeeById(@PathVariable("id") Long id) {
        Map<String, Object> employee = employeeService.getEmployeeWithDepartment(id);
        return ResponseEntity.ok(employee);
    }
}
