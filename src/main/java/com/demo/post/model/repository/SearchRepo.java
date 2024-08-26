package com.demo.post.model.repository;

import com.demo.post.model.domain.AmenityListModel;
import com.demo.post.model.domain.FilterModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SearchRepo {


    List<String> findByCity(String city);

    List<AmenityListModel> findAmenity(Long dormId);
}
