package com.demo.post.model.repository;

import com.demo.post.model.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long> {
    UsersEntity save(UsersEntity usersEntity);

    UsersEntity findByEmailAndPassword(String email, String password);

    List<UsersEntity> findAll();

    UsersEntity findByEmail(String email);

    @Modifying
    @Query("UPDATE UsersEntity u SET u.status = 'N' WHERE u.id = :id")
    void cancel(@Param("id") long id);
}
