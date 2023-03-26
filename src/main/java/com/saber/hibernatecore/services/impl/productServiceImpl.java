package com.saber.hibernatecore.services.impl;

import com.saber.hibernatecore.entities.Product;
import com.saber.hibernatecore.repositories.ProductRepository;
import com.saber.hibernatecore.services.productService;
import jakarta.transaction.Transactional;

import java.util.List;

public record productServiceImpl(
        ProductRepository productRepository) implements productService {

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
