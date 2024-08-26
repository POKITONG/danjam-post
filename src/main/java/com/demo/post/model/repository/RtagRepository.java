package com.demo.post.model.repository;


import com.demo.post.model.entity.RtagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RtagRepository extends JpaRepository<RtagsEntity, Long> {
}
