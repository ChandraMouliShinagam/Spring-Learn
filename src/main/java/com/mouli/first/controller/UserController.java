package com.mouli.first.controller;

import com.mouli.first.model.User;
import com.mouli.first.rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repo;
    @PostMapping("/addUser")
    public ResponseEntity<?> add(@RequestBody User user) {
        User saved = repo.save(user);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/")
    public String hello() {
        return "HellO.. App is up.";
    }
}
