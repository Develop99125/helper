package com.example.springboot_data.dao;

import com.example.springboot_data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
    public List<User> findAllByUsername(String name);
}
