package com.pm;

public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildHDD();
    String getResult();
}
