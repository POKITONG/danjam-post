package com.demo.post.model.domain;

import com.demo.post.model.entity.BookingsEntity;
import com.demo.post.model.entity.PaymentsEntity;
import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.entity.UsersEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingModel {
    private Long id;
    private UsersEntity usersEntity;
    private RoomsEntity roomsEntity;
    private PaymentsEntity paymentsEntity;
    private int person;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private String status;

}
