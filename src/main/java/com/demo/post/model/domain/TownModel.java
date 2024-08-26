package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class TownModel {
    private String name;

    public TownModel(String name) {
        this.name = name;
    }
}
