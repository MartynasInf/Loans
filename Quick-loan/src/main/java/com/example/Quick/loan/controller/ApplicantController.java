package com.example.Quick.loan.controller;


import com.example.Quick.loan.model.Applicant;
import com.example.Quick.loan.service.ApplicantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
@AllArgsConstructor
public class ApplicantController {

    private final ApplicantService applicantService;

    @GetMapping("/")
    public List<Applicant> findAll(){
        return applicantService.findAll();
    }



}
