package com.jingspace.learn.dao;

import com.jingspace.learn.model.MemberExam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberExamRepository extends JpaRepository<MemberExam, Long> {

}
