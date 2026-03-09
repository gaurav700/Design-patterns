package com.pm.entity;

import com.pm.SmartHomeMediator;
import com.pm.impl.AirConditioner;
import com.pm.impl.Light;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements SmartHomeMediator {
    private List<SmartDevice> devices = new ArrayList<>();
    @Override
    public void notify(SmartDevice device, String event) {
        if (event.equals("TEMP_HIGH")) {
            System.out.println("[SmartHomeHub] TEMP_HIGH detected. Turning on AC.");
            for (SmartDevice d : devices) {
                if (d instanceof AirConditioner) {
                    d.receiveCommand("ON");
                }
            }
        } else if (event.equals("TEMP_NORMAL")) {
            System.out.println("[SmartHomeHub] TEMP_NORMAL detected. Turning off AC.");
            for (SmartDevice d : devices) {
                if (d instanceof AirConditioner) {
                    d.receiveCommand("OFF");
                }
            }
        } else if (event.equals("NIGHT_MODE")) {
            System.out.println("[SmartHomeHub] NIGHT_MODE activated. Turning off lights.");
            for (SmartDevice d : devices) {
                if (d instanceof Light) {
                    d.receiveCommand("OFF");
                }
            }
        }
    }
    @Override
    public void registerDevice(SmartDevice device) {
        devices.add(device);
    }
}
