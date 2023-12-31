package com.example.appMusic.repositories;

import com.example.appMusic.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUserId(Integer id);
}
