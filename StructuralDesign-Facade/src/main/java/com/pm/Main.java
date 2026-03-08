package com.pm;
/**
 * The Facade Design Pattern is a structural design pattern that provides a single, simplified interface to a complex subsystem. Instead of forcing
 * clients to coordinate many moving parts, a facade hides the internal complexity and exposes a clean, easy-to-use entry point.<br>
 * Problem: Implement a SmartHomeFacade that controls lights, thermostat, and a security system. Provide leaveHome() and arriveHome() methods that coordinate all three subsystems.
 * <br> Requirements: <br>
 * leaveHome() turns off lights, sets thermostat to eco mode (18C), arms security system<br>
 * arriveHome() turns on lights, sets thermostat to comfort mode (22C), disarms security system<br>
 * Each subsystem prints its actions to the console<br>
 */
public class Main {
    public static void main(String[] args) {
        SmartHomeFacade facade = new SmartHomeFacade();
        facade.leaveHome();
        facade.delay(5000);
        facade.arriveHome();
    }
}