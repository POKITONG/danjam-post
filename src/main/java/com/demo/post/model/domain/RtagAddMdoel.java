package com.demo.post.model.domain;

import com.demo.post.model.entity.ReviewsEntity;
import com.demo.post.model.entity.RtagsEntity;
import com.demo.post.model.entity.TagsEntity;
import com.demo.post.model.repository.TagRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RtagAddMdoel {

    private List<Long> tagId;

    private ReviewsEntity reviewsEntity;
    private Long reviewId;



}

