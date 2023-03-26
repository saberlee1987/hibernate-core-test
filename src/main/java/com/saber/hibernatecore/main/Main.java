package com.saber.hibernatecore.main;

import com.saber.hibernatecore.entities.Product;
import com.saber.hibernatecore.repositories.ProductRepository;
import com.saber.hibernatecore.repositories.ProductRepositoryJPAImpl;
import com.saber.hibernatecore.repositories.impl.ProductRepositoryImpl;
import com.saber.hibernatecore.services.productService;
import com.saber.hibernatecore.services.impl.productServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ProductRepository productRepository = new ProductRepositoryImpl();
        ProductRepository productRepository = new ProductRepositoryJPAImpl();
        productService productService = new productServiceImpl(productRepository);
//        Product product = new Product();
//        product.setName("car");
//        product.setModel("j5");
//        product.setFactory("jack");
//        productService.save(product);
        List<Product> products = productService.findAll();
        products.forEach(
                p -> {
                    System.out.println("product ===> " + p);
                    System.out.println("===========================================================================================================================================");
                }
        );
    }
}
