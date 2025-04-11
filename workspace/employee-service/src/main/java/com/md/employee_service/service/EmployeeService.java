package com.md.employee_service.service;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    private WebClient webClient;

    @CircuitBreaker(name = "departmentService", fallbackMethod = "fallbackGetDepartment")
    public Map<String, Object> getEmployeeWithDepartment(Long id) {
        Map<String, Object> employee = new HashMap<>();
        employee.put("id", id);
        employee.put("name", "Mahesh");
        employee.put("location", "Pune");

        try {
            var department =
                    webClient.get().uri("/{id}", id).retrieve().bodyToMono(Map.class).block();
            log.debug("Department: {}", department);
            employee.put("department", department);


        } catch (WebClientException e){
            log.error("Department service is down", e);
            employee = Map.of("error", "Service is temporarily unavailable", "details", e.getMessage());
            log.debug("Employee: {}", employee);
        }
        return employee;
    }

    public Map<String, Object> fallbackGetDepartment(Long id,Throwable throwable) {
        Map<String, Object> employee = new HashMap<>();
        employee.put("id", id);
        employee.put("name", "Mahesh");
        employee.put("location", "Pune");
        employee.put("department", "service unavailable");
        return employee;
    }
}
