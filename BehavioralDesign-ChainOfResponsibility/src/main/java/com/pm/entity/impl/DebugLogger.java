package com.pm.entity.impl;

import com.pm.entity.LogLevel;
import com.pm.entity.LogMessage;

public class DebugLogger extends BaseLogger{
    @Override
    public void log(LogMessage message) {
        int loglevel = LogLevel.DEBUG.getLevelValue();
        if(message.level >= loglevel){
            System.out.println("[DEBUG] "+ message.message);
        }
        forward(message);
    }
}
