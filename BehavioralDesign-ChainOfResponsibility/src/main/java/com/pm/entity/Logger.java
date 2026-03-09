package com.pm.entity;

public interface Logger {
    void setNext(Logger logger);
    void log(LogMessage message);
}
