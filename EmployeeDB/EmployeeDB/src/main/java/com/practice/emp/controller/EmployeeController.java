package com.practice.emp.controller;

import com.practice.emp.entity.Employee;
import com.practice.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmpService service;

    @PostMapping("/add-emp")
    private Employee addingNewEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

}
