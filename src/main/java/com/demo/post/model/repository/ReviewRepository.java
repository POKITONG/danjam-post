package com.demo.post.model.repository;

import com.demo.post.model.entity.ReviewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewsEntity,Long> {

}
