package com.demo.post.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatsAndReviewModel {

    private List<ReviewDto> reviews;
    private DormStatsModel stats;

}
