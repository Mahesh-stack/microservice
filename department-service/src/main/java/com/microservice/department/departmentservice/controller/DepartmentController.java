package com.microservice.department.departmentservice.controller;

import com.microservice.department.departmentservice.client.EmployeeClient;
import com.microservice.department.departmentservice.entity.Department;
import com.microservice.department.departmentservice.entity.Employee;
import com.microservice.department.departmentservice.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    private final DepartmentService service;
    private final EmployeeClient employeeClient;

    @PostMapping("/add-department")
    public ResponseEntity<Department> addDepartment(@RequestBody Department department) {
        LOGGER.info("Inside department controller addDepartment() method");
        LOGGER.info("Department add: {}", department);
        return ResponseEntity.ok(service.addNewDepartment(department));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> findDepartmentById(@PathVariable Long id) {
        LOGGER.info("Inside department controller findDepartmentById() method");
        LOGGER.info("Department id: {}", id);
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAllDepartments")
    public ResponseEntity<List<Department>> findAllDepartments() {
        LOGGER.info("Inside department controller findAllDepartments() method");
        return ResponseEntity.ok(service.findAllDepartments());
    }

    @GetMapping("/with-employees")
    public ResponseEntity<List<Department>> findDepartmentWithEmployees() {
        LOGGER.info("Inside department controller findDepartmentWithEmployees() method");
        List<Department> departmentList = service.findAllDepartments();
        departmentList.forEach(department ->
                department.setEmployees(employeeClient.findByDepartmentId(department.getId())));
        return ResponseEntity.ok(departmentList);
    }

}
