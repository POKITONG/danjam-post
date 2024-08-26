package com.demo.post.model.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class DormBookingListModel {

    private Long id;
    private String name;
    private String address;
    private String status;
    private RoomModel room;
    private DormBookingModel booking;

    @Builder
    public DormBookingListModel(Long id, String name, String address, String status, RoomModel room, DormBookingModel booking) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.status = status;
        this.room = room;
        this.booking = booking;
    }


}
