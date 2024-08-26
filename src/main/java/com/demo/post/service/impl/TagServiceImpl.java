package com.demo.post.service.impl;

import com.demo.post.model.repository.TagRepository;
import com.demo.post.model.entity.TagsEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class TagServiceImpl {

    private final TagRepository TAGREPOSITORY;

}

