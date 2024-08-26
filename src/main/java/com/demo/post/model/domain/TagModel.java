package com.demo.post.model.domain;

import com.demo.post.model.entity.TagsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagModel {
    private Long id;
    private String name;
    private String PN;

}
