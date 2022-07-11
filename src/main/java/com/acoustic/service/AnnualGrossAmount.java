package com.acoustic.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class AnnualGrossAmount implements SalaryCalculatorService{

    public static final int MONTHS_NUMBER = 12;

    @Override
    public String getDescription() {
        return "Annual gross";
    }

    @Override
    public BigDecimal apply(final BigDecimal grossMonthlySalary) {
        return grossMonthlySalary.multiply(BigDecimal.valueOf(MONTHS_NUMBER)).setScale(2, RoundingMode.HALF_EVEN);
    }
}
