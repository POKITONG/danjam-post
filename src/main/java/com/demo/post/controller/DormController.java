package com.demo.post.controller;

import com.demo.post.model.domain.AmenityListModel;
import com.demo.post.model.domain.DormBookingListModel;
import com.demo.post.service.impl.DormServiceImpl;
import com.demo.post.service.impl.RoomService;
import com.demo.post.service.impl.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class DormController {

    private final DormServiceImpl DORMSERVICE;
    private final RoomService ROOMSERVICE;
    private final SearchService SEARCHSERVICE;



    @PostMapping("/dorm/Update")
    public ResponseEntity<String> updateDorms(@RequestBody List<Long> selectedDorms) {
        System.out.println("dorms: " + selectedDorms);
        try {
            DORMSERVICE.updateDorms(selectedDorms);
            return ResponseEntity.ok(selectedDorms.size() + " Dorms updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating dorms");
        }
    }

    //todo 0816일 02:39 호텔에 대한 상세정보

}
