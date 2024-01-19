package com.microservice.department.departmentservice.client;

import com.microservice.department.departmentservice.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId);
}
