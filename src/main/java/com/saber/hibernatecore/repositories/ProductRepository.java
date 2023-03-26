package com.saber.hibernatecore.repositories;

import com.saber.hibernatecore.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
    List<Product> findAllByFactory(String factory);
    Optional<Product> findById(Long id);
    Product save(Product product);
    Product update(Product product);
    Boolean deleteById(Long id);
}