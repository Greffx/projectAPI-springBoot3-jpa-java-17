package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.User;
import com.studyingByMyself.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
