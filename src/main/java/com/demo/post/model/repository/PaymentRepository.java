package com.demo.post.model.repository;

import com.demo.post.model.entity.PaymentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentsEntity, Long> {
}
