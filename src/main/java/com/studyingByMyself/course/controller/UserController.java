package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> endpointGetToReturnOnlyOneUser(@PathVariable Integer id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<User>> endpointGetToReturnAllUsers() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User user) {
        return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userService.insert(user)).toUri()).body(userService.insert(user));
    }
}
