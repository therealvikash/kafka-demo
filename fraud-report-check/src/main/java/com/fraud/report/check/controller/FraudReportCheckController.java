package com.fraud.report.check.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fraud.report.check.vo.FraudActivity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
//@Log4j
public class FraudReportCheckController {
    @KafkaListener(topics="elder-fraud-topic", groupId = "elder-fraud")
    public void checkFraud(String message) {
        ObjectMapper om = new ObjectMapper();
        FraudActivity fraudActivity;
        try {
            fraudActivity = om.readValue(message, FraudActivity.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
//        log.info("The name of customer is {}", fraudActivity.g);
        System.out.println(fraudActivity);
    }
}
