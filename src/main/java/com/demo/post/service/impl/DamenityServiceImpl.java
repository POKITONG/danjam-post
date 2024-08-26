package com.demo.post.service.impl;

import com.demo.post.model.entity.AmenitiesEntity;
import com.demo.post.model.repository.AmenityRepository;
import com.demo.post.model.repository.DamenityRepository;
import com.demo.post.model.entity.DamenitiesEntity;
import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.repository.DormRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Transactional
@RequiredArgsConstructor
public class DamenityServiceImpl implements DamenityService {

    private final DormRepository DORMREPOSITORY;
    private final DamenityRepository DAMENITYREPOSITORY;
    private final AmenityRepository AMENITYREPOSITORY;

}
