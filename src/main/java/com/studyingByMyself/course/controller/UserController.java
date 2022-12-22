package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.repository.UserRepository;
import com.studyingByMyself.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> endpointGetToReturnOnlyOneUser(@PathVariable Integer id) {
        return ResponseEntity.ok().body(userService.findUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> endpointGetToReturnAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
}
