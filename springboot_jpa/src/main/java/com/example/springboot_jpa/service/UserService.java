package com.example.springboot_jpa.service;

import com.example.springboot_jpa.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void createNewUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);

    public List<User> findAllByUsername(String name);
}
