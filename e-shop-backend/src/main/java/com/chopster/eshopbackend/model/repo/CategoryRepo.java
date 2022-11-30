package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    void deleteCategoryById(Long id);

    Optional<Category> findCategoryById(Long id);
}
