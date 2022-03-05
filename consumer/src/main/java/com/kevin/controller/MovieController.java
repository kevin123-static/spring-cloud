package com.kevin.controller;


import com.kevin.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public UserEntity findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        UserEntity user = this.restTemplate.getForObject("http://localhost:8000/users/{id}", UserEntity.class, id);
        // ...电影微服务的业务...
        return user;
    }
}