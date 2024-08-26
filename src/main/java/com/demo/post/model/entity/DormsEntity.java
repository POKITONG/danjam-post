package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@ToString
@Table(name = "dorm")
@DynamicInsert // default
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class DormsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Column(name = "contact_num", length = 13, nullable = true)
    private String contactNum;

    private String city;
    private String town;
    private String address;

    @Column(name = "d_category_id")
    private Long dCategoryId;

    @Column(name = "user_id")
    private Long userId;

    @ColumnDefault("N")
    private String status;

}
