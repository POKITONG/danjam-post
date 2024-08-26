package com.demo.post.service.impl;

import com.demo.post.model.entity.DcategoriesEntity;
import com.demo.post.model.repository.DcategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class DcategoryServiceImpl implements DcategoryService {

    private final DcategoryRepository DCATEGORYREPOSITORY;


}

