package com.hms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.bean.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
