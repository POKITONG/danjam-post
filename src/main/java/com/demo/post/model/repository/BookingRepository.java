package com.demo.post.model.repository;

import com.demo.post.model.entity.BookingsEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookingsEntity, Long> {

    @EntityGraph(attributePaths = {"users", "room", "payment"}, type = EntityGraph.EntityGraphType.LOAD)
//    @Query("select b, u.id, u.email, u.name, u.phoneNum, u.role, r, p from Booking b"
//            + " join fetch b.users u"
//            + " join fetch b.room r"
//            + " join fetch b.payment p"
//            + " where u.id = :id")
    List<BookingsEntity> findByUsersId(Long id);
}
