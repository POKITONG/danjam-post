package com.demo.post.model.domain;

import com.demo.post.model.entity.Role;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String name;
    private Role role;

    @Builder
    public UserModel(Long id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}
