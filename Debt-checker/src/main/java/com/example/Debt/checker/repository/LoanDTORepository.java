package com.example.Debt.checker.repository;

import com.example.Debt.checker.model.LoanDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanDTORepository extends JpaRepository<LoanDTO, Long> {

    List<LoanDTO> findByPersonalID(Long personalID);
}
