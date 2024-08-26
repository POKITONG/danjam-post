package com.demo.post.model.domain;

import com.demo.post.model.entity.AmenitiesEntity;
import com.demo.post.model.entity.DormsEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DamenityAddModel {

    private AmenitiesEntity amenitiesEntity; // 카테고리
    private List<Long> amenityId;

    private DormsEntity dormsEntity; // 판매자
    private Long dormId;




}

