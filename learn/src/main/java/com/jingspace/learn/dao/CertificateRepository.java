package com.jingspace.learn.dao;

import com.jingspace.learn.model.Certificate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {

}
