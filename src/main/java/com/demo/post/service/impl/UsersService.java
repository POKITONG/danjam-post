package com.demo.post.service.impl;

import com.demo.post.model.repository.UsersRepository;
import com.demo.post.model.entity.UsersEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class    UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void save(UsersEntity usersEntity) {
        usersRepository.save(usersEntity);
    }

    public List<UsersEntity> findAll() {
        return usersRepository.findAll();
    }

    public UsersEntity findByEmail(String email) { return usersRepository.findByEmail(email); }

    public List<UsersEntity> findUsersList() { return usersRepository.findAll(); }

    public UsersEntity findById(long id) {
        return usersRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public void cancel(long id) {
        usersRepository.cancel(id);
    }
}
