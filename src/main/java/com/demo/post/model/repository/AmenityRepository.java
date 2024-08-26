package com.demo.post.model.repository;



import com.demo.post.model.entity.AmenitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface AmenityRepository extends JpaRepository<AmenitiesEntity, Long> {

    @Override
    List<AmenitiesEntity> findAll();

    @Override
    Optional<AmenitiesEntity> findById(Long id);
}
