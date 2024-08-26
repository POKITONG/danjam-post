package com.demo.post.service.impl;

import com.demo.post.model.repository.RtagRepository;
import com.demo.post.model.repository.ReviewRepository;
import com.demo.post.model.repository.TagRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Transactional
@RequiredArgsConstructor
public class RtagServiceImpl  {

    private final ReviewRepository REVIEWREPOSITORY;
    private final RtagRepository RTAGREPOSITORY;
    private final TagRepository TAGREPOSITORY;

}
