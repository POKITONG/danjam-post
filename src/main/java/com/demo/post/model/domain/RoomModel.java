package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class RoomModel {
    private Long id;
    private String name;
    private String type;

    @Builder
    public RoomModel(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}
