package com.demo.post.controller;

import com.demo.post.service.impl.DcategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class DcategoryController {

    private final DcategoryServiceImpl DCATEGORYSERVICE;

}
