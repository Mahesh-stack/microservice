package com.consume.delivery.boy.config;

import com.consume.delivery.boy.constants.AppConstant;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = AppConstant.LOCATION_UPDATE_TOPIC, groupId = AppConstant.GROUP_ID)
    public void updateLocation(String message){
        System.out.println(message);
    }
}
