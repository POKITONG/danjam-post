package com.demo.post.controller;

import com.demo.post.model.repository.ReviewRepository;
import com.demo.post.service.impl.ReviewServiceImpl;
import com.demo.post.service.impl.RtagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {

    private final ReviewServiceImpl REVIEWSERVICE;
    private final RtagServiceImpl RTAGSERVICE;
    private final ReviewRepository REVIEWREPOSITORY;


}
