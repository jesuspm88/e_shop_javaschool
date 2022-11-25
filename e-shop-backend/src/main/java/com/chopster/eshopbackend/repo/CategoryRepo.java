package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    void deleteCategoryById(Integer id);

    Optional<Category> findCategoryById(Integer id);
}
