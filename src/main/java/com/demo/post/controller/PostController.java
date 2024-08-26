package com.demo.post.controller;

import com.demo.post.model.domain.PostModel;
import com.demo.post.model.entity.PostEntity;
import com.demo.post.service.impl.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/post")
// 전형적인 인터페이스 구조, API
// 이름을 넣으면 해당 기능이 호출됨
// post 가 api, 해당 구현체가 controller
// 두가지 방식이 있을 때는 항상 한가지가 디폴트 int long 중 int, float double 중 double

public class PostController {

    private final PostService POSTSERVICE;

    @GetMapping
    public List<?> findAll() {
        return POSTSERVICE.findAll();
    }

    @PostMapping
    public PostEntity save(PostModel post) {
        return POSTSERVICE.save(post);
    }

    @GetMapping("/{id}")
    public Optional<?> findById(@PathVariable Long id) {
        return POSTSERVICE.findById(id);
    }

    @DeleteMapping
    public void deleteById(Long id) {
        POSTSERVICE.deleteById(id);
    }

    @GetMapping("/count")
    public long count() {
        return POSTSERVICE.count();
    }
}
