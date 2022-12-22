package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.User;
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

   /* @GetMapping
    public ResponseEntity<User> endpointGetToReturnOnlyOneUser(Integer id) {
        return null;
    }*/

    @GetMapping
    public ResponseEntity<List<User>> endpointGetToReturnAllUsers() {
        User user = new User(1, "Maria", "maria@gmail.com", "5199999999", "1234");
        User user1 = new User(2, "Maria2", "maria2@gmail.com", "5199999999", "12344");
        User user2 = new User(3, "Maria3", "maria3@gmail.com", "5199999999", "12343");

        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(user1);
        users.add(user2);

        return ResponseEntity.ok().body(users);
    }
}
