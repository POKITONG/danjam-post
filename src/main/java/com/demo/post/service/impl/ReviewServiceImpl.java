package com.demo.post.service.impl;

import com.demo.post.model.entity.BookingsEntity;
import com.demo.post.model.entity.ReviewsEntity;
import com.demo.post.model.repository.BookingRepository;
import com.demo.post.model.repository.ReviewRepository;
import com.demo.post.model.entity.UsersEntity;
import com.demo.post.model.repository.UsersRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class ReviewServiceImpl  {
    private final UsersRepository USERSREPOSITORY;
    private final BookingRepository BOOKINGREPOSITORY;
    private final ReviewRepository REVIEWREPOSITORY;


}
