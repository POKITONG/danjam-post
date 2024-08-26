package com.demo.post.model.repository;

import com.demo.post.model.entity.RoomsEntity;

import java.util.List;
import java.util.Optional;

public interface RoomRepositoryCustom {
    Optional<Long> findRoomIdsByDormId(Long dormId);

    List<RoomsEntity> getRoomByDormId(Long dormId);
}
