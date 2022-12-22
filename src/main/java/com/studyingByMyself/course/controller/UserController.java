package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /*@GetMapping
    public ResponseEntity<User> endpointGetToReturnOnlyOneUser(Integer id) {
        return null;
    }*/

    @GetMapping
    public ResponseEntity<List<User>> endpointGetToReturnAllUsers() {
        List<User> users = userRepository.findAll();
        return ResponseEntity.ok().body(users);
    }
}
