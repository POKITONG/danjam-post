package com.demo.post.response;

import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.WishesEntity;
import com.demo.post.model.entity.UsersEntity;
import lombok.*;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WishResponse {

    private Long id;
    private UsersResponse user;
    private DormResponse dorm;


}
