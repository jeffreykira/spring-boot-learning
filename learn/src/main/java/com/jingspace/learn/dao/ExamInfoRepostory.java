package com.jingspace.learn.dao;

import com.jingspace.learn.model.ExamInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamInfoRepostory extends JpaRepository<ExamInfo, Long> {
    
}
