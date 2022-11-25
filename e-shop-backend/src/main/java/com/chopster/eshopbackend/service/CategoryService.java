package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.CategoryNotFoundException;
import com.chopster.eshopbackend.model.Category;
import com.chopster.eshopbackend.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryService {
    private final CategoryRepo categoryRepo;

    @Autowired
    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category addCategory(Category category){
        return categoryRepo.save(category);
    }

    public List<Category> findAllCategories() {
        return categoryRepo.findAll();
    }

    public Category updateCategory(Category category){
        return categoryRepo.save(category);
    }

    public Category findCategoryById(Integer id){
        return categoryRepo.findCategoryById(id).orElseThrow(() -> new CategoryNotFoundException("Category by id " + id + " was not found."));
    }

    public void deleteCategory(Integer id){
        categoryRepo.deleteCategoryById(id);
    }
}
