package com.report.fraud.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDetails {
    private String customerName;
    private String customerAge;
    private String customerId;
}