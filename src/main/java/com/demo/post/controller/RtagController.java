package com.demo.post.controller;

import com.demo.post.service.impl.RtagServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RtagController {

    private final RtagServiceImpl RTAGSERVICE;


}
