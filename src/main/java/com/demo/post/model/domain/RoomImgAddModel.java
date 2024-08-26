package com.demo.post.model.domain;

import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.entity.RoomImgsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomImgAddModel {

    private String name;

    private String nameOriginal;

    private String size;

    private String ext;

    private RoomsEntity roomsEntity;

    private Long roomId;


}
