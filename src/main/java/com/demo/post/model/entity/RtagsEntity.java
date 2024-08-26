package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@Table(name = "r_tag")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RtagsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "tag_id")
    private Long tagId;
}
