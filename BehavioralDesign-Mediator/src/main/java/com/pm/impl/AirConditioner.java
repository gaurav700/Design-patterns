package com.pm.impl;

import com.pm.entity.SmartDevice;
import com.pm.SmartHomeMediator;

public class AirConditioner extends SmartDevice {
    public AirConditioner(SmartHomeMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receiveCommand(String command) {
        if(command.equals("ON")){
            System.out.println(name+": Turned ON");
        }else if(command.equals("OFF")){
            System.out.println(name+": Turned OFF");
        }
    }
}
