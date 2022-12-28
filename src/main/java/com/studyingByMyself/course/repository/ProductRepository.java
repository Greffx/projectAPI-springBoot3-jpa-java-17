package com.studyingByMyself.course.repository;

import com.studyingByMyself.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
