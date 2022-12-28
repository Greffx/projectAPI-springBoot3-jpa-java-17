package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Order;

import java.util.List;

public interface OrderServiceInterface {

    public Order findOneOrderById(Integer id);
    public List<Order> findAll();
}
