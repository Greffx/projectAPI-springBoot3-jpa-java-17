package com.studyingByMyself.course.repository;

import com.studyingByMyself.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
