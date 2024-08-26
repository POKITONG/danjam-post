package com.demo.post.model.repository;

import com.demo.post.model.entity.TagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<TagsEntity, Long> {
}
