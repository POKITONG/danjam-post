package com.demo.post.service.impl;

import com.demo.post.model.domain.PostModel;
import com.demo.post.model.entity.PostEntity;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<?> findAll();
    PostEntity save (PostModel post);
    Optional<?> findById(Long id);
    void deleteById(Long id);
    long count();


}
