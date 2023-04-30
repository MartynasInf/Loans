package com.example.Debt.checker.controller;

import com.example.Debt.checker.model.LoanDTO;
import com.example.Debt.checker.model.LoansInfo;
import com.example.Debt.checker.service.LoanDTOService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loansDTO")
@AllArgsConstructor
public class LoanDTOController {

    private final LoanDTOService loanDTOService;

    @GetMapping("/getPersonalLoans/{personalId}")
    public LoansInfo findPersonalLoans(@PathVariable Long personalId){
        LoansInfo loansInfo = new LoansInfo();
        loansInfo.setApplicantId(personalId);
        loansInfo.setApplicantLoans(loanDTOService.findAllLoansByPersonalId(personalId));
        return loansInfo;
    }
}
