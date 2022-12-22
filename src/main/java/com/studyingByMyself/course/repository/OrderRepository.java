package com.studyingByMyself.course.repository;

import com.studyingByMyself.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
