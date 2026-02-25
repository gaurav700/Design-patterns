package com.pm.entity;

import java.util.UUID;

public class Platform {
    private final String id;
    private final String name;
    private final String description;
    public Platform(String name, String description) {
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
        return "Platform{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
