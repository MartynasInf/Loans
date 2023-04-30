package com.example.Debt.checker.service;

import com.example.Debt.checker.model.LoanDTO;
import com.example.Debt.checker.repository.LoanDTORepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LoanDTOService {

    private final LoanDTORepository loanDTORepository;

    public List<LoanDTO> findAllLoansByPersonalId(Long personalID){

        return loanDTORepository.findByPersonalID(personalID);
    }
}
