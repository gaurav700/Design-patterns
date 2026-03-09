package com.pm.entity.impl;

import com.pm.entity.LogMessage;
import com.pm.entity.Logger;

public abstract class BaseLogger implements Logger {
    protected Logger next;

    @Override
    public void setNext(Logger logger) {
        this.next = logger;
    }

    protected void forward(LogMessage msg){
        if(next!=null){
            next.log(msg);
        }
    }
}
