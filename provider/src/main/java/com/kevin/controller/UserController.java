package com.kevin.controller;

import com.kevin.dao.UserRepository;
import com.kevin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/users")
@RestController
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User();
        user.setId(1l);
        user.setUsername("test");
        return user;
    }
}