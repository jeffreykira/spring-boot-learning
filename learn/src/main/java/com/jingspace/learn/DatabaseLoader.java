package com.jingspace.learn;

import com.jingspace.learn.dao.MemberRepository;
import com.jingspace.learn.model.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Member member = new Member("jeffrey77918@gmail.com", "abc123", "Jeffrey", "Wu");
        memberRepository.save(member);
    }
}
