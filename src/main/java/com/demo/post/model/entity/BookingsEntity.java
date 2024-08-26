package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Table(name = "booking")
@DynamicInsert // default
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BookingsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id")
    private Long userId;
    
    @Column(name = "room_id")
    private Long roomId;

    @Column(name = "payment_id")
    private Long paymentId;
    
    private int person;

    @Column(name = "check_in")
    private LocalDateTime checkIn;

    @Column(name = "check_out")
    private LocalDateTime checkOut;

    private String status;

}
