package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Product;
import com.studyingByMyself.course.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements  ProductServiceInterface{

    @Autowired
    private ProductRepository ProductRepository;

    public Product findById(Integer id) {
        Optional<Product> optional = ProductRepository.findById(id);
        return optional.get();
    }

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

}
