package com.jingspace.learn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendorId;
    private String name;

    public ExamInfo() {
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
