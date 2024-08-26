package com.demo.post.controller;

import com.demo.post.service.impl.RoomImgServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@RestController
@CrossOrigin
@RequiredArgsConstructor
public class RoomImgController {

    private final RoomImgServiceImpl ROOMIMGSERVICE;

}
