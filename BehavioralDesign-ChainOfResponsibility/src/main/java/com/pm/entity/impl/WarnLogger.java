package com.pm.entity.impl;

import com.pm.entity.LogLevel;
import com.pm.entity.LogMessage;
import com.pm.entity.Logger;

public class WarnLogger extends BaseLogger{
    @Override
    public void log(LogMessage message) {
        int loglevel = LogLevel.WARN.getLevelValue();
        if(message.level >= loglevel){
            System.out.println("[WARN] "+ message.message);
        }
        forward(message);
    }
}
