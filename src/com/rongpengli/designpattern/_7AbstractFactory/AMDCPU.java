package com.rongpengli.designpattern._7AbstractFactory;

public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Now in AMD CPU, pins=" + pins);
    }

}
