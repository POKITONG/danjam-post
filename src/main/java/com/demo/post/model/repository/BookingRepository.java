package com.demo.post.model.repository;

import com.demo.post.model.entity.BookingsEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingsEntity, Long> {

}
