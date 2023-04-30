package com.example.Quick.loan.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private Long personalID;
    private Integer numberOfChildren;
    private Double salary;

    @OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
    private List<Loan> loans;
}
