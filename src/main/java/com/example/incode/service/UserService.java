package com.example.incode.service;

import com.example.incode.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> findAll();

    Optional<User> findById(String id);

    User save(User user);

    void deleteById(String id);
}
