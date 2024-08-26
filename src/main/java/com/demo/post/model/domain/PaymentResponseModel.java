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
    public PaymentsEntity toEntity(final UsersEntity usersEntity) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(approvedAt, formatter);

        return PaymentsEntity.builder()
                .paymentKey(paymentKey)
                .orderId(orderId)
                .totalAmount(totalAmount)
                .status(status)
                .approvedAt(zonedDateTime.toLocalDateTime())
                .usersEntity(usersEntity)
                .build();
    }
}
