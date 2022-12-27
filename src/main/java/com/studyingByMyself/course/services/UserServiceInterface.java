package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.User;

import java.util.List;

public interface UserServiceInterface {

    public List<User> findAll();

    public User findUserById(Integer id);
}
