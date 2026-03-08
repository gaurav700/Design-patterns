
package com.pm;


/*
TIP The Adapter Design Pattern is a structural design pattern that allows incompatible interfaces to work together by converting
 the interface of one class into another that the client expects.<br>
 Problem: You have a Thermometer interface that returns temperature in Celsius. A third-party weather sensor library provides <br>
 readings in Fahrenheit through a different interface. Write an adapter so your application can use the Fahrenheit sensor as if it were a Celsius thermometer.
<br>
Requirements: <br>
Target interface: Thermometer with getTemperature() returning Celsius (double)<br>
Adaptee: FahrenheitSensor with readFahrenheit() returning Fahrenheit (double)<br>
Adapter: converts Fahrenheit to Celsius using (F - 32) * 5/9<br>
*/


import com.pm.Adaptee.FarhenheitSensor;
import com.pm.Adapter.FarhrenheitSensorAdapter;
import com.pm.Target.CelsiusSensor;
import com.pm.Target.Thermometer;

public class Main {
    public static void main(String[] args) {
        Thermometer celsius = new CelsiusSensor();
        System.out.printf("Celsius sensor: %.1f C%n", celsius.getTemperature());

         FarhenheitSensor sensor = new FarhenheitSensor();
         Thermometer adapted = new FarhrenheitSensorAdapter(sensor);
         System.out.printf("Fahrenheit sensor (adapted): %.1f C%n", adapted.getTemperature());
    }
}