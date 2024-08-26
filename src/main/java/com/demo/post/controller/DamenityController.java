package com.demo.post.controller;

import com.demo.post.service.impl.AmenityServiceImpl;
import com.demo.post.service.impl.DamenityServiceImpl;
import com.demo.post.service.impl.DormServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class DamenityController {

    private final DamenityServiceImpl DAMENITYSERVICE;
    private final DormServiceImpl DORMSERVICE;
    private final AmenityServiceImpl AMENITYSERVICE;

}
