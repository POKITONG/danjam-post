package com.demo.post.service.impl;

import com.demo.post.model.repository.RoomImgRepository;
import com.demo.post.model.entity.RoomsEntity;
import com.demo.post.model.repository.RoomRepository;
import com.demo.post.model.entity.RoomImgsEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RoomImgServiceImpl implements RoomImgService {

    private final RoomRepository ROOMREPOSITORY;
    private final RoomImgRepository ROOMIMGREPOSITORY;

}
