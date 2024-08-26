package com.demo.post.model.domain;

import com.demo.post.model.entity.PaymentsEntity;
import com.demo.post.model.entity.UsersEntity;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public record PaymentResponseModel(
        String paymentKey,
        String orderId,
        int totalAmount,
        String status,
        String approvedAt
) {
    
}
