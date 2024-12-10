package com.report.fraud.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FraudActivity {
    private boolean misuseByCaretaker;
    private double monthlyWithdrawLimit;
    private double dailyWithdrawLimit;
    private double dailyDepositLimit;
    private double monthlyDepositLimit;
    private String customerAssistance;
    private CustomerDetails customerDetails;
}
