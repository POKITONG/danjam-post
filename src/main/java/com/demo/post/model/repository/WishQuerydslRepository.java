package com.demo.post.model.repository;

import com.demo.post.response.WishWithSliceResponse;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WishQuerydslRepository {

    List<WishWithSliceResponse> findWishes(Long userId, Pageable pageable);

}
