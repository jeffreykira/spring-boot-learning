package com.jingspace.learn.controller;

import java.util.Collection;

import com.jingspace.learn.dao.CertificateRepository;
import com.jingspace.learn.model.Certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CertificateController {

    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping("/certificates")
    public Collection<Certificate> certificates() {
        return certificateRepository.findAll();
    }
}
