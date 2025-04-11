package com.md.department_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping("/{id}")
    ResponseEntity<Map<String, String>> getDepartmentById(@PathVariable("id") Long id) {
        Map<String, String> department = new HashMap<>();
        department.put("id", id.toString());
        department.put("name", "IT");
        department.put("location", "Pune");
        return ResponseEntity.ok(department);
    }
}