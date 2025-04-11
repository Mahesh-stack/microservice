package com.consume.delivery.boy.service;

import com.consume.delivery.boy.entity.EmployeeEntity;
import com.consume.delivery.boy.model.EmployeeModel;
import com.consume.delivery.boy.repository.EmployeeRespository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRespository employeeRespository;

    public Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public void saveEmployeeDetails(EmployeeModel employeeModel) {
        logger.info("Employee Details {}", employeeModel);
        EmployeeEntity employee = EmployeeEntity.builder()
                .desg(employeeModel.getDesg())
                .name(employeeModel.getName())
                .location(employeeModel.getLocation())
                .build();

        employeeRespository.save(employee);
        logger.info("Employee Data saved successfully {}", employee);
    }
}
