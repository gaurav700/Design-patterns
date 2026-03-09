package com.pm.entity;

public enum LogLevel {
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4); // Semicolon is required after the list of constants

    private final int levelValue; // Private final field to store the value

    // Private constructor to initialize the value
    private LogLevel(int levelValue) {
        this.levelValue = levelValue;
    }

    // Public getter method to access the value
    public int getLevelValue() {
        return this.levelValue;
    }
}
