package com.example.Quick.loan.controller;

import com.example.Quick.loan.model.Loan;
import com.example.Quick.loan.model.LoanDTO;
import com.example.Quick.loan.model.LoansInfo;
import com.example.Quick.loan.repository.LoanRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/loans")
@AllArgsConstructor
public class LoanController {

    private final LoanRepository loanRepository;

    @GetMapping("/applicantLoans/{applicantPersonalId}")
    public LoansInfo checkIfLoanCanBeGiven(@PathVariable Long applicantPersonalId) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI("http://localhost:8081/api/loansDTO/getPersonalLoans/" + applicantPersonalId);

        String urlas = "http://localhost:8081/api/loansDTO/getPersonalLoans/" + applicantPersonalId;
        LoansInfo loansInfo = restTemplate.getForObject(urlas, LoansInfo.class, applicantPersonalId);
        return loansInfo;
        //person.setTotalTax(taxes.getTotalTax());
    }
}
