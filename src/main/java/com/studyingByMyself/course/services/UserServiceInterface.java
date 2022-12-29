package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.User;

import java.util.List;

public interface UserServiceInterface {

    public User findById(Integer id);
    public List<User> findAll();
    public User insert(User user);
    public void delete(Integer id);
}