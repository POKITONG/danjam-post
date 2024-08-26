package com.demo.post.service.impl;

import com.demo.post.model.domain.PostModel;
import com.demo.post.model.entity.PostEntity;
import com.demo.post.model.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
// 싱글톤
public class PostServiceImpl implements PostService {

    private final PostRepository POSTREPOSITORY;

    @Override
    public List<?> findAll() {
        return POSTREPOSITORY.findAll();
    }

    @Override
    public PostEntity save(PostModel post) {

        PostEntity entity = new PostEntity();

        return POSTREPOSITORY.save(entity);
    }

    @Override
    public Optional<?> findById(Long id) {
        return POSTREPOSITORY.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        POSTREPOSITORY.deleteById(id);
    }

    @Override
    public long count() {
        return POSTREPOSITORY.count();
    }
}
