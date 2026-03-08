package com.pm.Adapter;

import com.pm.Adaptee.FarhenheitSensor;
import com.pm.Target.Thermometer;

public class FarhrenheitSensorAdapter implements Thermometer {

    private FarhenheitSensor farhenheitSensor;

    public FarhrenheitSensorAdapter(FarhenheitSensor farhenheitSensor) {
        this.farhenheitSensor = farhenheitSensor;
    }

    @Override
    public double getTemperature() {
        double temp = farhenheitSensor.readFarhenheit();
        return (temp - 32) * 5.0 / 9.0;
    }
}
