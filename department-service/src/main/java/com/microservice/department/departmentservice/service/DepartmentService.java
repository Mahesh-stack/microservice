package com.microservice.department.departmentservice.service;

import com.microservice.department.departmentservice.entity.Department;
import com.microservice.department.departmentservice.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    private final DepartmentRepository repository;

    public Department addNewDepartment(Department department) {
        return repository.save(department);
    }
}
