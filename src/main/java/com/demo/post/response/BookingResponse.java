package com.demo.post.response;

import com.demo.post.model.entity.BookingsEntity;
import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.PaymentsEntity;
import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.entity.UsersEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponse {

    private Long id;

    private UsersResponse users;

    private RoomResponse room;

    private DormResponse dorm;

    private PaymentResponse payment;

    private int person;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime checkIn;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime checkOut;

    private String status;


}
