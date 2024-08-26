package com.demo.post.controller;

import com.demo.post.service.impl.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;


    /*@GetMapping("/showAll")
    public ResponseEntity<Map<String, Object>> getDorms(Pageable pageable) {
        Map<String, Object> resultMap = new HashMap();
        Page<DormDto> list = (Page<DormDto>) searchService.findAllList();
        if (list.isEmpty()) {
            resultMap.put("result", "fail");
            resultMap.put("dormList", null);
        } else {
            resultMap.put("result", "success");
            resultMap.put("dormList", list);
        }
        return ResponseEntity.ok(resultMap);
    }*/
//    @GetMapping("/showAll")
//    public ResponseEntity<Map<String, Object>> findAllList() {
//        Map<String, Object> resultMap = new HashMap();
//
//        List<DormDto> list = searchService.findAllList();
//        // List<DormDto> list = searchService.findAllList();
////        List<Tuple> list = searchService.findAllList();
//        System.out.println("findAllList: "+list);
//        if (list.isEmpty()) {
//            resultMap.put("result", "fail");
//            resultMap.put("dormList", null);
//        } else {
//            resultMap.put("result", "success");
//            resultMap.put("dormList", list);
//        }
//
//        System.out.println(searchService.findAllList());
//
//        return ResponseEntity.ok(resultMap);
//    }




}
