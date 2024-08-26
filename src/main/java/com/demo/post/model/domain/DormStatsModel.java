package com.demo.post.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DormStatsModel {

    private Long dormId;
    private Double cleanliness;
    private Double accuracy;
    private Double checkIn;
    private Double communication;
    private Double location;
    private Double costEffectiveness;
    private Double kindness;
    private Double rateAverage;


}
