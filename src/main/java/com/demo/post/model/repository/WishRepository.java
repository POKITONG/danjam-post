package com.demo.post.model.repository;

import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.UsersEntity;
import com.demo.post.model.entity.WishesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface WishRepository extends JpaRepository<WishesEntity, Long>, WishQuerydslRepository {

    @EntityGraph(attributePaths = {"users", "dorm"})
    @Query("select w from WishesEntity w where w.users.id = :userId")
    Page<WishesEntity> findWishesOrderByCreatedAtDesc(Long userId, Pageable pageable);

    Optional<WishesEntity> findByUsersAndDorm(UsersEntity user, DormsEntity dormsEntity);

    boolean existsByUsersAndDorm(UsersEntity user, DormsEntity dormsEntity);
}
