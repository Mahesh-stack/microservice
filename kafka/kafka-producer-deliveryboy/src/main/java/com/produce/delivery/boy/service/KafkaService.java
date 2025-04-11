package com.produce.delivery.boy.service;

import com.produce.delivery.boy.utility.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private final Logger logger = LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstant.LOCATION_UPDATE_TOPIC, location);
        logger.info("Message Produced");

    }
}
