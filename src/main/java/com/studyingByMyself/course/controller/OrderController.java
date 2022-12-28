package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.Order;
import com.studyingByMyself.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findOneOrderById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(orderService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Order>> findAllOrders() {
        return ResponseEntity.ok().body(orderService.findAll());
    }
}
