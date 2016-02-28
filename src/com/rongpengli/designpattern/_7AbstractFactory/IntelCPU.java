package com.rongpengli.designpattern._7AbstractFactory;

public class IntelCPU implements CPUApi {
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Now in Intel CPU, pins=" + pins);
    }

}
