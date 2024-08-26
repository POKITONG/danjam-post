package com.demo.post.service.impl;

import com.demo.post.model.entity.BookingsEntity;
import com.demo.post.model.repository.BookingRepository;
import com.demo.post.model.repository.PaymentRepository;
import com.demo.post.model.entity.PaymentsEntity;
import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.repository.RoomRepository;
import com.demo.post.model.entity.UsersEntity;
import com.demo.post.model.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final String TOSS_API_URL = "https://api.tosspayments.com/v1/payments/confirm";

    private final PaymentRepository paymentRepository;
    private final UsersRepository usersRepository;
    private final RoomRepository roomRepository;
    private final BookingRepository bookingRepository;

    @Value("${payments.toss.secret.key}")
    private String widgetSecretKey;


    private String getEncodedAuthHeader() {
        String auth = widgetSecretKey + ":";
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));

        return "Basic " + new String(encodedAuth);
    }
}
