package com.demo.post.model.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DcategoryListModel {
    private Long id; // 댓글 고유

    private String name;
}
