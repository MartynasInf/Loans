package com.example.Quick.loan.config;

import com.example.Quick.loan.model.Applicant;
import com.example.Quick.loan.repository.ApplicantRepository;
import com.example.Quick.loan.repository.LoanRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {
    @Bean
    CommandLineRunner commandLineRunner(ApplicantRepository applicantRepository, LoanRepository loanRepository) {
        return args -> {
            Applicant edvinas = Applicant.builder()
                    .name("Edvinas")
                    .surname("Prokofijovas")
                    .age(31)
                    .numberOfChildren(1)
                    .salary(5500.0)
                    .personalID(39106060529L)
                    .build();
            applicantRepository.save(edvinas);

        };
    }

}
