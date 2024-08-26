package com.demo.post.service.impl;

import com.demo.post.model.repository.BookingRepository;
import com.demo.post.response.BookingResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final BookingRepository bookingRepository;


}
