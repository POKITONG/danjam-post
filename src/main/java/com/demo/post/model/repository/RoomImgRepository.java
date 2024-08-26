package com.demo.post.model.repository;

import com.demo.post.model.entity.RoomImgsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RoomImgRepository extends JpaRepository<RoomImgsEntity,Long> {

    @Override
    Optional<RoomImgsEntity> findById(Long id);

}
