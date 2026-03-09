package com.pm;

import com.pm.entity.LogMessage;
import com.pm.entity.impl.DebugLogger;
import com.pm.entity.impl.ErrorLogger;
import com.pm.entity.impl.InfoLogger;
import com.pm.entity.impl.WarnLogger;

/**
 * TIP The Chain of Responsibility Design Pattern is a behavioral pattern that lets you pass requests along a chain of handlers, allowing each handler to decide whether to process the request or pass it to the next handler in the chain.
 * Build a log level filter chain where each logger handles messages at or above its level. A DebugLogger handles all messages, InfoLogger handles INFO and above, WarnLogger handles WARN and above, and ErrorLogger handles only ERROR. Each logger prints the message at its level and passes it to the next logger.
 * Requirements:
 * LogLevel constants: DEBUG=1, INFO=2, WARN=3, ERROR=4
 * LogMessage class with level and message fields
 * Logger interface with setNext() and log() methods
 * BaseLogger abstract class with forwarding logic
 * DebugLogger handles level >= 1, prints [DEBUG] message
 * InfoLogger handles level >= 2, prints [INFO] message
 * WarnLogger handles level >= 3, prints [WARN] message
 * ErrorLogger handles level >= 4, prints [ERROR] message
 */
public class Main {
    public static void main(String[] args) {
        ErrorLogger error = new ErrorLogger();
        WarnLogger warn = new WarnLogger();
        InfoLogger info = new InfoLogger();
        DebugLogger debug = new DebugLogger();
        error.setNext(warn);
        warn.setNext(info);
        info.setNext(debug);
        error.log(new LogMessage(2, "User logged in"));
        error.log(new LogMessage(4, "Database connection lost"));
    }
}