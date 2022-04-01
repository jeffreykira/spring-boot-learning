package com.jingspace.learn.controller;

import java.util.Collection;
import java.util.Optional;

import com.jingspace.learn.dao.VendorRepository;
import com.jingspace.learn.model.Vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;

    @GetMapping("/vendors")
    public Collection<Vendor> vendors() {
        return vendorRepository.findAll();
    }

    @GetMapping("/vendors/{id}")
    public ResponseEntity<?> getVendor(@PathVariable long id) {
        Optional<Vendor> vendor = vendorRepository.findById(id);
        return vendor.map(response -> ResponseEntity.ok().body(vendor))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
