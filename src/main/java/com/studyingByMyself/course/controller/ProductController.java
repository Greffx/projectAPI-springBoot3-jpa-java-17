package com.studyingByMyself.course.controller;

import com.studyingByMyself.course.entities.Product;
import com.studyingByMyself.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> endpointGetToReturnOnlyOneProduct(@PathVariable Integer id) {
        return ResponseEntity.ok().body(productService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Product>> endpointGetToReturnAllProducts() {
        List<Product> Products = productService.findAll();
        return ResponseEntity.ok().body(Products);
    }
}
