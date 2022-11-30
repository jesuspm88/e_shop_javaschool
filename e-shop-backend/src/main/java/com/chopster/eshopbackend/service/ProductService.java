package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.ProductNotFoundException;
import com.chopster.eshopbackend.model.Product;
import com.chopster.eshopbackend.model.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

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

    public Product findProductById(Long id){
        return productRepo.findProductById(id).orElseThrow(() -> new ProductNotFoundException("Product by id " + id + " was not found."));
    }

    public void deleteProduct(Long id){
        productRepo.deleteProductById(id);
    }
}
