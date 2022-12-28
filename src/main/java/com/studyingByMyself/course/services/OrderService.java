package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Order;
import com.studyingByMyself.course.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService  implements OrderServiceInterface {

    @Autowired
    private OrderRepository orderRepository;

    public Order findOneOrderById(Integer id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        return  orderOptional.get();
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
