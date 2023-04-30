package com.example.Quick.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoansInfo {

    private Long applicantId;
    private List<Loan> applicantLoans;
}
