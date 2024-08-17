package com.springheaven.orderpaymentservice.repository;

import com.springheaven.orderpaymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}