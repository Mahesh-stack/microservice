package com.produce.delivery.boy.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.produce.delivery.boy.model.EmployeeModel;
import com.produce.delivery.boy.utility.AppConstant;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void saveEmployeeData(EmployeeModel model) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonValue = objectMapper.writeValueAsString(model);
        kafkaTemplate.send(AppConstant.EMPLOYEE_DATA, jsonValue);
        logger.info("Employee message produces");
    }
}
