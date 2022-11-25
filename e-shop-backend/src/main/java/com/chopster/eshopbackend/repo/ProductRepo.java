package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    void deleteProductById(Integer id);

    Optional<Product> findProductById(Integer id);
}
