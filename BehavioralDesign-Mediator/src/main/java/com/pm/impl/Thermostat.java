package com.pm.impl;

import com.pm.entity.SmartDevice;
import com.pm.SmartHomeMediator;

public class Thermostat extends SmartDevice {
    private int temperature = 72;
    public Thermostat(SmartHomeMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveCommand(String command) {
        System.out.println("Thermostat doesn't received command");
    }

    public void setTemperature(int temperature) {
        System.out.println(name + ": Temperature set to " + temperature);
        if(temperature > 75){
            mediator.notify(this, "TEMP_HIGH");
        }else {
            mediator.notify(this, "TEMP_NORMAL");
        }
    }
}
