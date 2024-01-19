package com.learn.employeeservice.service;

import com.learn.employeeservice.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public Employee findById(Long id) {
        return employeeList.stream().filter(emp -> emp.id().equals(id)).findFirst().orElseThrow();
    }

    public List<Employee> findAll() {
        return employeeList;
    }

    public Employee findByDepartment(Long departmentId) {
        return employeeList.stream().filter(emp -> emp.departmentId().equals(departmentId)).findFirst().orElseThrow();
    }
}
