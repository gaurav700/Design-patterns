package com.pm;

import com.pm.Products.Arm;
import com.pm.Products.Light;
import com.pm.Products.Thermostat;

public class SmartHomeFacade {
    public Arm arm;
    public Thermostat thermostat;
    public Light light;

    public SmartHomeFacade(){
        arm = new Arm();
        thermostat = new Thermostat();
        light = new Light();
    }

    public void leaveHome(){
        System.out.println("leaving home");
        delay(500);
        light.off();
        delay(1000);
        thermostat.setEco();
        delay(2000);
        arm.alarmOn();

    }

    public void arriveHome(){
        System.out.println("Arrive home");
        delay(500);
        light.on();
        delay(2000);
        arm.alarmOff();
        delay(1000);
        thermostat.setComfort();

    }

    public void delay(int ms){
        try{
            Thread.sleep(ms);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
