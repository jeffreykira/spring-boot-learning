package com.jingspace.learn.controller;

import java.util.Collection;

import com.jingspace.learn.dao.ExamInfoRepository;
import com.jingspace.learn.model.ExamInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ExamController {

    @Autowired
    private ExamInfoRepository examInfoRepository;

    @GetMapping("/exams")
    public Collection<ExamInfo> exams() {
        return examInfoRepository.findAll();
    }
}
