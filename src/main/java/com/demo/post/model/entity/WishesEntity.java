package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Table(name = "wish")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WishesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dorm_id")
    private Long dormId;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

}
