package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@ToString
@Table(name = "d_category")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DcategoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 댓글 고유

    private String name;
}
