package com.demo.post.service.impl;

import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.repository.RoomRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomServiceImplCus implements RoomRepositoryCustom {


    private final RoomService ROOMSERVICE;

    @Qualifier("roomRepositoryCustomImpl")
    private final RoomRepositoryCustom ROOMREPOSITORYCUSTOM;

    @Override
    public Optional<Long> findRoomIdsByDormId(Long dormId) {
        return ROOMSERVICE.findRoomIdByDormId(dormId);

    }

    @Override
    public List<RoomsEntity> getRoomByDormId(Long dormId) {
        return ROOMREPOSITORYCUSTOM.getRoomByDormId(dormId);
    }


}
