package com.pm.entity;

import com.pm.SmartHomeMediator;

public abstract class SmartDevice {
    protected SmartHomeMediator mediator;
    protected String name;

    public SmartDevice(SmartHomeMediator mediator,  String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveCommand(String command);

}
