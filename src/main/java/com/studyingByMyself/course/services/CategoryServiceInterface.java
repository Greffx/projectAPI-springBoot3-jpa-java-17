package com.studyingByMyself.course.services;

import com.studyingByMyself.course.entities.Category;

import java.util.List;

public interface CategoryServiceInterface {

    public Category findById();
    public List<Category> findAll();
}
