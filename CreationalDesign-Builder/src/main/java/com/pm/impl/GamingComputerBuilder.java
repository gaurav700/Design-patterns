package com.pm.impl;

import com.pm.Builder;
import com.pm.Computer;

public class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("Gaming RAM");
    }

    @Override
    public void buildHDD() {
        computer.setHdd("Gaming HDD");
    }

    @Override
    public String getResult() {
        return computer.toString();
    }
}
