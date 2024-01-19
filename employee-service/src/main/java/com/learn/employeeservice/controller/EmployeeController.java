package com.learn.employeeservice.controller;

import com.learn.employeeservice.entity.Employee;
import com.learn.employeeservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService service;

    @PostMapping("/add-employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        LOGGER.info("Inside addEmployee method: {}", employee);
        return ResponseEntity.ok(service.addEmployee(employee));
    }

    @GetMapping("/findEmployee/{id}")
    public ResponseEntity<Employee> findEmployee(@PathVariable Long id) {
        LOGGER.info("Inside findEmployee method: {}", id);
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAllEmployee")
    public ResponseEntity<List<Employee>> findEmployees() {
        LOGGER.info("Inside findEmployee method");
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<Employee> findByDepartmentId(@PathVariable Long departmentId) {
        LOGGER.info("Inside findByDepartmentId: {}", departmentId);
        return ResponseEntity.ok(service.findByDepartment(departmentId));
    }

}
