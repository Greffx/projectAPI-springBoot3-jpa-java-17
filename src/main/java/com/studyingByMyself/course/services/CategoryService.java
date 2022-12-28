package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Category;
import com.studyingByMyself.course.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements CategoryServiceInterface{

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findById(Integer id) {
        Optional<Category> optional = categoryRepository.findById(id);
        return optional.get();
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

}
