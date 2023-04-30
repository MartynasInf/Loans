package com.example.Debt.checker.config;

import com.example.Debt.checker.model.LoanDTO;
import com.example.Debt.checker.repository.LoanDTORepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class AppConfig {

    private final LoanDTORepository loanDTORepository;
    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            LoanDTO loan1 = LoanDTO.builder()
                    .amount(15000L)
                    .lengthInMonths(60)
                    .personalID(39106060529L)
                    .build();
            LoanDTO loan2 = LoanDTO.builder()
                    .amount(100000L)
                    .lengthInMonths(120)
                    .personalID(39106060529L)
                    .build();

            loanDTORepository.saveAll(Arrays.asList(loan1, loan2));

        };
    }
}
