package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@ToString
@Table(name = "d_amenity")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DamenitiesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

    @Column(name = "amenity_id")
    private Long amenityId; // 카테고리

    @Column(name = "dorm_id")
    private Long dormId;


}
