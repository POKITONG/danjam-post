package com.demo.post.model.domain;

import com.demo.post.model.entity.DcategoriesEntity;
import com.demo.post.model.entity.UsersEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DormAddModel {

    private String name;

    private String description;

    private String contactNum;

    private String city;

    private String town;

    private String address;

    private DcategoriesEntity dcategoriesEntity; //카테고리

    private UsersEntity user; // 판매자

    private Long categoryId;

    private Long usersId;

    private String status;

}
