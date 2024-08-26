package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ImgModel {
    private Long id;
    private String name;
    private String ext;

    @Builder
    public ImgModel(Long id, String name, String ext) {
        this.id = id;
        this.name = name;
        this.ext = ext;
    }
}
