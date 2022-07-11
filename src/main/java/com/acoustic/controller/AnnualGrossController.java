package com.acoustic.controller;


import com.acoustic.entity.AnnualGross;
import com.acoustic.repository.AnnualGrossRepository;
import com.acoustic.service.SalaryCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Map;


@RestController
@RequestMapping("/annual-gross")
@RequiredArgsConstructor
@Validated
@CrossOrigin
public class AnnualGrossController {

    public static final String DESCRIPTION = "description";
    public static final String VALUE = "value";
    private final AnnualGrossRepository annualGrossRepository;
    private final SalaryCalculatorService salaryCalculatorService;


    @PostMapping("/calculation/{grossMonthlySalary}")
    public Map<String, String> calculateAnnualGross(@PathVariable @Min(2000)BigDecimal grossMonthlySalary){
        var annualGross = this.salaryCalculatorService.apply(grossMonthlySalary);
        this.annualGrossRepository.save(AnnualGross.builder().annualGrossAmount(annualGross).build());
        return  Map.of(DESCRIPTION,this.salaryCalculatorService.getDescription(), VALUE, String.valueOf(annualGross));
    }
}
