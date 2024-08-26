package com.demo.post.controller;


import com.demo.post.service.impl.RoomServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RoomController {

    private final RoomServiceImpl ROOMSERVICE;


    @GetMapping("/room/{id}")
    public HashMap<String, Object> getRoomIdsByDormId(@PathVariable("id") Long dormId) {
        HashMap<String, Object> roomController = new HashMap<>();

        System.out.println("id: " + dormId);

        try {
            List<Long> room = ROOMSERVICE.getRoomIdsByDormId(dormId);
            roomController.put("result", "success");
            roomController.put("rooms ", room);
            roomController.put("roomController ", room);
        } catch (Exception e) {
            e.printStackTrace();
            roomController.put("success", "fail");
        }
        return roomController;
    }

}
