package com.pm.entity.impl;

import com.pm.entity.LogLevel;
import com.pm.entity.LogMessage;

public class InfoLogger extends BaseLogger{
    @Override
    public void log(LogMessage message) {
        int loglevel = LogLevel.INFO.getLevelValue();
        if(message.level >= loglevel){
            System.out.println("[INFOs] "+ message.message);
        }
        forward(message);
    }
}
