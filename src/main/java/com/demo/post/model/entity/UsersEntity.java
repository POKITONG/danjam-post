package com.demo.post.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@Table(name = "users")
@DynamicInsert // default
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Setter
    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Setter
    @Column(name = "phone_number", nullable = false)
    private int phoneNum;

    @Column(name = "role", nullable = true)
    private String role;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updateAt;

    @Column(name = "status")
    @ColumnDefault("Y")
    private String status;


    public UsersEntity(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = getRole();
    }
}