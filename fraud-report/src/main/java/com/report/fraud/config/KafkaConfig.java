package com.report.fraud.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean("elder-fraud-topic")
    public NewTopic eFTopic() {
        return TopicBuilder.name("elder-fraud-topic").build();
    }

    @Bean("unusual-fraud-topic")
    public NewTopic uFTopic() {
        return TopicBuilder.name("unusual-fraud-activity").build();
    }
}
