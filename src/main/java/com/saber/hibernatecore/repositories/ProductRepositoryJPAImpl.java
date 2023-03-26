package com.saber.hibernatecore.repositories;

import com.saber.hibernatecore.entities.Product;
import com.saber.hibernatecore.util.EntityMangerUtil;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryJPAImpl implements ProductRepository {

    @Override
    public List<Product> findAll() {
        EntityManager entityManager = EntityMangerUtil.entityManager();
        return entityManager.createNamedQuery("Product.findAll",Product.class).getResultList();
    }

    @Override
    public List<Product> findAllByFactory(String factory) {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Boolean deleteById(Long id) {
        return null;
    }
}
