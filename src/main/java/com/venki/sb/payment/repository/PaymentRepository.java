package com.venki.sb.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venki.sb.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
