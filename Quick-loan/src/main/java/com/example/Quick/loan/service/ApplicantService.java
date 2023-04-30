package com.example.Quick.loan.service;

import com.example.Quick.loan.model.Applicant;
import com.example.Quick.loan.repository.ApplicantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    public List<Applicant> findAll(){
        return applicantRepository.findAll();
    }

}
