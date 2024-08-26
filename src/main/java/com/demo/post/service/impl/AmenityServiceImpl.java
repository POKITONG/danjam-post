package com.demo.post.service.impl;

import com.demo.post.model.repository.AmenityRepository;
import com.demo.post.model.entity.AmenitiesEntity;
import com.demo.post.model.domain.AmenityListModel;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class AmenityServiceImpl implements AmenityService {

    private final AmenityRepository AMENITYREPOSITORY;

    @Override
    public List<AmenityListModel> list() {

        List<AmenitiesEntity> amenities = AMENITYREPOSITORY.findAll();

        return amenities.stream()
                .map(dcategory -> AmenityListModel.builder()
                .id(dcategory.getId())
                .name(dcategory.getName())
                .build())
                .collect(Collectors.toList());

    }
}

