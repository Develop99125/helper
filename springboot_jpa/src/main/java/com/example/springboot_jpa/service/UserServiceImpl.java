package com.example.springboot_jpa.service;

import com.example.springboot_jpa.dao.UserDAO;
import com.example.springboot_jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public void createNewUser(User user) {
        userDAO.save(user);
    }

    @Override
    public User getUser(int id) {
        User user = null;
        Optional<User> userOpt = userDAO.findById(id);
        if(userOpt.isPresent()){
            user = userOpt.get();
        }
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public List<User> findAllByUsername(String name) {
        return userDAO.findAllByUsername(name);
    }
}
