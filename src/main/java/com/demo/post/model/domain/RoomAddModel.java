package com.demo.post.model.domain;

import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.RoomsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomAddModel {

    private String name;

    private String description;

    private int person;

    private int price;

    private String type;

    private DormsEntity dormsEntity;

    private Long dormId;


}
