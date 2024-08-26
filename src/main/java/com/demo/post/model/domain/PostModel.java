package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Builder
@Component
@Data
public class PostModel {

    private Long id;
    private String title;
    private String content;
    private Long userId;
    private Date createdAtE;
    private Date updatedAt;

}
