package com.pm.entity.impl;

import com.pm.entity.LogLevel;
import com.pm.entity.LogMessage;

public class ErrorLogger extends BaseLogger{
    @Override
    public void log(LogMessage message) {
        int loglevel = LogLevel.ERROR.getLevelValue();
        if(message.level >= loglevel){
            System.out.println("[Error] "+ message.message);
        }
        forward(message);
    }
}
