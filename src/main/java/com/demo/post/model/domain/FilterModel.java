package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class FilterModel {
    private SearchModel searchModel;
    private List<Long> amenities;
    private List<String> cities;

    @Builder
    public FilterModel(SearchModel searchModel, List<Long> amenities, List<String> cities) {
        this.searchModel = searchModel;
        this.amenities = amenities;
        this.cities = cities;
    }
}
