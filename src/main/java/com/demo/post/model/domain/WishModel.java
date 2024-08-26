package com.demo.post.model.domain;

import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.UsersEntity;
import com.demo.post.model.entity.WishesEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WishModel {
    private Long id;
    private UsersEntity usersEntity;
    private DormsEntity dormsEntity;
    private LocalDateTime createdAt;

}
