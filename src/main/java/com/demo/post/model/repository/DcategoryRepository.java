package com.demo.post.model.repository;


import com.demo.post.model.entity.DcategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DcategoryRepository extends JpaRepository<DcategoriesEntity, Long> {
    @Override
    Optional<DcategoriesEntity> findById(Long id);

    @Override
    List<DcategoriesEntity> findAll();

}
