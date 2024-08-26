package com.demo.post.model.domain;

import com.demo.post.model.entity.ReviewsEntity;
import com.demo.post.model.entity.RtagsEntity;
import com.demo.post.model.entity.TagsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RtagModel {
    private Long id;
    private ReviewsEntity reviewsEntity;
    private TagsEntity tagsEntity;

}
