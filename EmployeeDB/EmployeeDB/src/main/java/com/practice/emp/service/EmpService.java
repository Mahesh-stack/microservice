package com.practice.emp.service;

import com.practice.emp.entity.Employee;
import com.practice.emp.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
