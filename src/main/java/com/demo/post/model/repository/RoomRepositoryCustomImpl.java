package com.demo.post.model.repository;

import com.demo.post.model.entity.RoomsEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Primary
public class RoomRepositoryCustomImpl implements RoomRepositoryCustom {

    private final JPAQueryFactory JPAQUERYFACTORY;


    @Override
    public Optional<Long> findRoomIdsByDormId(Long dormId) {
        return Optional.empty();
    }

    @Override
    public List<RoomsEntity> getRoomByDormId(Long dormId) {
        return List.of();
    }
}

