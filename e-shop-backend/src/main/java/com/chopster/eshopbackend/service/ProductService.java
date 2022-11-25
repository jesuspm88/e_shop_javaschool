package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.ProductNotFoundException;
import com.chopster.eshopbackend.model.Product;
import com.chopster.eshopbackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> findAllProducts() {
        return productRepo.findAll();
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProductById(Integer id){
        return productRepo.findProductById(id).orElseThrow(() -> new ProductNotFoundException("Product by id " + id + " was not found."));
    }

    public void deleteProduct(Integer id){
        productRepo.deleteProductById(id);
    }
}
