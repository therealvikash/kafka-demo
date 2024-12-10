package com.report.fraud.bo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.report.fraud.vo.FraudActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FraudReportBO {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public String reportFraud(FraudActivity fraudActivity) throws Exception {
        try {
            ObjectMapper om = new ObjectMapper();
            kafkaTemplate.send("elder-fraud-topic", om.writeValueAsString(fraudActivity));
        } catch (Exception e) {
            throw new Exception("Error occurred during publishing message!!!");
        }
        return "Message published Successfully.";
    }
}
