package com.saber.hibernatecore.repositories.impl;

import com.saber.hibernatecore.entities.Product;
import com.saber.hibernatecore.repositories.ProductRepository;
import com.saber.hibernatecore.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Optional;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        List<Product> products;
        try (Session session = HibernateUtil.openSession()){
            products = session.createQuery("select p from Product p", Product.class).list();
        }
        return products;
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
        try (Session session = HibernateUtil.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(product);
            transaction.commit();
        }
        return product;
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
