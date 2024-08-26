package com.demo.post.model.domain;

import com.demo.post.model.entity.BookingsEntity;
import com.demo.post.model.entity.ReviewsEntity;
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
public class ReviewDto {
    private Long id;
    private Long userId;
    private String email;
    private Long bookingId;
    private String content;
    private UsersEntity usersEntity;
    private BookingsEntity bookingsEntity;
    private double rate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;



    public ReviewDto(Long id, String content, Double rate, Long userId, Long bookingId, LocalDateTime createdAt,
                     LocalDateTime updatedAt, String email) {
        this.id = id;
        this.content = content;
        this.rate = rate;
        this.userId = userId;
        this.bookingId = bookingId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.email = email;
    }
}
