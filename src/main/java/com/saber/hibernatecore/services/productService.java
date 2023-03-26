package com.saber.hibernatecore.services;

import com.saber.hibernatecore.entities.Product;

import java.util.List;

public interface productService {
    List<Product> findAll();
    Product save(Product product);
}
