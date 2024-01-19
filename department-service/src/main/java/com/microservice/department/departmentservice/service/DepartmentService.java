package com.microservice.department.departmentservice.service;

import com.microservice.department.departmentservice.controller.DepartmentController;
import com.microservice.department.departmentservice.entity.Department;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class DepartmentService {
    //private final DepartmentRepository repository;

    List<Department> departments = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
    public Department addNewDepartment(Department department) {
        departments.add(department);
        return department;
    }

    public Department findById(Long id) {
        return departments.stream().filter(dep -> dep.getId() == id).findFirst().orElseThrow();
    }

    public List<Department> findAllDepartments() {
        return departments;
    }
}
