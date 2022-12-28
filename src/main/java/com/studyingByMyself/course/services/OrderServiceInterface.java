package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Order;

import java.util.List;

public interface OrderServiceInterface {

    public Order findById(Integer id);
    public List<Order> findAll();
}
