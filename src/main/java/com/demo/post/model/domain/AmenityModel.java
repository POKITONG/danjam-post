package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AmenityModel {
    private Long id;
    private String name;

    @Builder
    public AmenityModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
