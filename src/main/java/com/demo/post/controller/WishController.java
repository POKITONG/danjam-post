package com.demo.post.controller;

import com.demo.post.response.WishWithSliceResponse;
import com.demo.post.service.impl.WishService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/wishes")
@RequiredArgsConstructor
public class WishController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private final WishService wishService;

    @GetMapping("/{id}")
    public ResponseEntity<Slice<WishWithSliceResponse>> getAllWishes(
            @PathVariable Long id,
            @PageableDefault(size = 25)
            @SortDefault(sort = "createdAt", direction = Sort.Direction.DESC)
            Pageable pageable) {
        Slice<WishWithSliceResponse> wishResponsePage = wishService.findAllByUsersById(id, pageable);

        return new ResponseEntity<>(wishResponsePage, HttpStatus.OK);
    }

}
