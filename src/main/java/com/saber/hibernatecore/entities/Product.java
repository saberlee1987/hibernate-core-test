package com.saber.hibernatecore.entities;

import jakarta.persistence.*;

//import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products")
@NamedQuery(name = "Product.findAll",query = "select p from Product p")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",length = 128)
    private String name;
    @Column(name = "model",length = 128)
    private String model;
    @Column(name = "factory",length = 128)
    private String factory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(model, product.model) && Objects.equals(factory, product.factory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, factory);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}
