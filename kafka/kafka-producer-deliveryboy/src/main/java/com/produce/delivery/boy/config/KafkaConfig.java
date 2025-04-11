package com.produce.delivery.boy.config;


import com.produce.delivery.boy.utility.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic createNewTopic() {
        return TopicBuilder
                .name(AppConstant.LOCATION_UPDATE_TOPIC)
                .build();
    }

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name(AppConstant.EMPLOYEE_DATA).build();
    }
}
