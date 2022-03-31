package com.jingspace.learn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MemberExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberExamId;
    @ManyToOne
    @JoinColumn(name = "mid")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "examId")
    private ExamInfo examInfo;
    private Date joinTime;

    public MemberExam() {
    }

    public Long getMemberExamId() {
        return memberExamId;
    }

    public void setMemberExamId(Long memberExamId) {
        this.memberExamId = memberExamId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ExamInfo getExamInfo() {
        return examInfo;
    }

    public void setExamInfo(ExamInfo examInfo) {
        this.examInfo = examInfo;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }
}
