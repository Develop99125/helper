package com.example.springboot_jpa.dao;

import com.example.springboot_jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer> {
    public List<User> findAllByUsername(String name);
}
