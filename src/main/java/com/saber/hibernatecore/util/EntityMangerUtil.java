package com.saber.hibernatecore.util;

import jakarta.persistence.*;

public class EntityMangerUtil {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY;

    static {
        ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("mysql");
    }

    public static EntityManager entityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
