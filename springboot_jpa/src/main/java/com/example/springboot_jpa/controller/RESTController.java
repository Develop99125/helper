package com.example.springboot_jpa.controller;

import com.example.springboot_jpa.entity.User;
import com.example.springboot_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.getUser(id);
        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        userService.createNewUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userService.createNewUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "User with id = " + id + " was deleted!";
    }

    @GetMapping("/users/name/{name}")
    public List<User> getUserByName(@PathVariable String name){
        return userService.findAllByUsername(name);
    }
}
