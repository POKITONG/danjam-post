package com.demo.post.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DormListModel {
    private Long id;

    private String name;

    private String description;

    private String contactNum;

    private String city;

    private String town;

    private String address;

    private String status;

    private List<String> roomImgNames;

}
