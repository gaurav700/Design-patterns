package com.pm.entity;

import java.util.UUID;

public class Product {
    private final String id;
    private final String name;
    private final String description;
    public Product(String name, String description) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
