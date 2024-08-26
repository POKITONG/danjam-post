package com.demo.post.model.repository;


import com.demo.post.model.entity.RoomsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoomRepository extends JpaRepository<RoomsEntity, Long> {

    @Override
    Optional<RoomsEntity> findById(Long id);

    List<RoomsEntity> findByDormId(Long dormId);
}
