package com.jingspace.learn.controller;

import java.util.Collection;
import java.util.Optional;

import com.jingspace.learn.dao.CompanyRepository;
import com.jingspace.learn.model.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public Collection<Company> companies() {
        return companyRepository.findAll();
    }

    @GetMapping("/companies/{id}")
    public ResponseEntity<?> getCompany(@PathVariable Long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.map(response -> ResponseEntity.ok().body(company))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
