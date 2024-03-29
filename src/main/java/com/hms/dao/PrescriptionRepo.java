package com.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hms.bean.Prescription;

@Repository
public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {

}