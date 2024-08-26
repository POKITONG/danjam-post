package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryModel {
    private Long id;
    private String name;

    @Builder
    public CategoryModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
