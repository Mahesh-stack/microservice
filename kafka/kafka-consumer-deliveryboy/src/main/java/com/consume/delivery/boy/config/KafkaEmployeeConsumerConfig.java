package com.consume.delivery.boy.config;

import com.consume.delivery.boy.constants.AppConstant;
import com.consume.delivery.boy.model.EmployeeModel;
import com.consume.delivery.boy.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@RequiredArgsConstructor
public class KafkaEmployeeConsumerConfig {

    private final EmployeeService employeeService;

    @KafkaListener(topics = AppConstant.EMPLOYEE_DATA, groupId = AppConstant.GROUP_ID)
    public void receivedEmployeeData(String employeeModel) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        EmployeeModel model = mapper.readValue(employeeModel, EmployeeModel.class);
        System.out.println("Employee Model " + model);
        employeeService.saveEmployeeDetails(model);
    }
}
