package com.pm;

import com.pm.entity.SmartHomeHub;
import com.pm.impl.AirConditioner;
import com.pm.impl.Light;
import com.pm.impl.Thermostat;

//TIP The Mediator Design Pattern is a behavioral pattern that defines an object (the Mediator) to encapsulate how a set of objects interact.
public class Main {
    public static void main(String[] args) {
         SmartHomeHub hub = new SmartHomeHub();
         Thermostat thermostat = new Thermostat(hub, "Living Room Thermostat");
         Light lights = new Light(hub, "Living Room Lights");
         AirConditioner ac = new AirConditioner(hub, "Central AC");
         hub.registerDevice(thermostat);
         hub.registerDevice(lights);
         hub.registerDevice(ac);
         thermostat.setTemperature(80);  // should trigger AC on
         thermostat.setTemperature(70);  // should trigger AC off
         hub.notify(lights, "NIGHT_MODE"); // should turn off lights
    }
}