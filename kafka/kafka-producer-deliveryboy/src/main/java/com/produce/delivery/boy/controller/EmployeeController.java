package com.produce.delivery.boy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.produce.delivery.boy.model.EmployeeModel;
import com.produce.delivery.boy.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<?> newEmployee(@RequestBody EmployeeModel model) throws JsonProcessingException {
        employeeService.saveEmployeeData(model);
        return new ResponseEntity<>(Map.of("Employee", model), HttpStatus.CREATED);

    }
}
