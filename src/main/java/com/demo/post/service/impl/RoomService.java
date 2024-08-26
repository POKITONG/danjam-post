package com.demo.post.service.impl;

import java.util.List;
import java.util.Optional;

public interface RoomService {

    List<Long> getRoomIdsByDormId(Long dormId);

    Optional<Long> findRoomIdByDormId(Long dormId);

}
