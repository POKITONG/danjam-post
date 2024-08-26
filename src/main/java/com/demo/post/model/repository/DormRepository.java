package com.demo.post.model.repository;


import com.demo.post.model.entity.DormsEntity;
import com.demo.post.model.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DormRepository extends JpaRepository<DormsEntity, Long> {

    @Override
    Optional<DormsEntity> findById(Long id);

    List<DormsEntity> findByUser(UsersEntity user);

    List<DormsEntity> findByStatus(String status);

    boolean existsByAddress(String address);
}
