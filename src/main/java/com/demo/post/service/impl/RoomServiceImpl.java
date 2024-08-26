package com.demo.post.service.impl;

import com.demo.post.model.repository.RoomRepository;
import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.repository.DormRepository;
import com.demo.post.model.entity.RoomsEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final DormRepository DORMREPOSITORY;
    private final RoomRepository ROOMREPOSITORY;


    @Override
    public List<Long> getRoomIdsByDormId(Long dormId) {
        return ROOMREPOSITORY.findByDormId(dormId)
                .stream()
                .map(RoomsEntity::getId)
                .toList();
    }

    @Override
    public Optional<Long> findRoomIdByDormId(Long dormId) {
        return ROOMREPOSITORY.findByDormId(dormId).stream().findFirst().map(RoomsEntity::getId);
    }

}
