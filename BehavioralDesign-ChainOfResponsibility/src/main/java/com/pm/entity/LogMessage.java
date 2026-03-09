package com.pm.entity;

public class LogMessage {
    public int level;
    public String message;
    public LogMessage(int level, String message) {
        this.level = level;
        this.message = message;
    }
}
