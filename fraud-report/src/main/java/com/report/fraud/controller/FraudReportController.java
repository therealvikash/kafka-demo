package com.report.fraud.controller;

import com.report.fraud.service.FraudReportService;
import com.report.fraud.vo.FraudActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fraud/referral")
public class FraudReportController {

    @Autowired
    private FraudReportService fraudReportService;

    @PostMapping("/reporting")
    public String reportFraud(@RequestBody FraudActivity fraudActivity) throws Exception {
        try {
            return fraudReportService.reportFraud(fraudActivity);
        } catch (Exception e) {
            throw new Exception("Error occurred during publishing message!!!");
        }
    }
}
