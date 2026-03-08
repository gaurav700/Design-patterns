package com.pm.impl;

import com.pm.Builder;
import com.pm.Computer;

public class ProfessionalComputerBuilder implements Builder {
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("Professional CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("Professional RAM");
    }

    @Override
    public void buildHDD() {
        computer.setHdd("Professional HDD");
    }

    @Override
    public String getResult() {
        return computer.toString();
    }
}
