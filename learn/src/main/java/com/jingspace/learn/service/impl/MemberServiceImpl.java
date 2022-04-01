package com.jingspace.learn.service.impl;

import java.util.Date;
import java.util.UUID;

import com.jingspace.learn.dao.MemberRepository;
import com.jingspace.learn.model.Member;
import com.jingspace.learn.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        member.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        member.setCreateTime(new Date());
        memberRepository.save(member);
        return member;
    }
}
