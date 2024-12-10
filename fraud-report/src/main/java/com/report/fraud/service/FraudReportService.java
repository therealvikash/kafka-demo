package com.report.fraud.service;

import com.report.fraud.bo.FraudReportBO;
import com.report.fraud.vo.FraudActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraudReportService {

    @Autowired
    private FraudReportBO fraudReportBO;
    public String reportFraud(FraudActivity fraudActivity) throws Exception {
        try {
            return fraudReportBO.reportFraud(fraudActivity);
        }
        catch (Exception e) {
            throw new Exception("Error occurred during publishing message!!!");
        }
    }
}
