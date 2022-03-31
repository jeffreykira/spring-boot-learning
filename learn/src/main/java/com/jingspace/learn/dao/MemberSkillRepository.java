package com.jingspace.learn.dao;

import com.jingspace.learn.model.MemberSkill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberSkillRepository extends JpaRepository<MemberSkill, Long> {

}
