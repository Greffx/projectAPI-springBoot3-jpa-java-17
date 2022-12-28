package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Product;

import java.util.List;

public interface ProductServiceInterface {

    public Product findById(Integer id);
    public List<Product> findAll();
}
