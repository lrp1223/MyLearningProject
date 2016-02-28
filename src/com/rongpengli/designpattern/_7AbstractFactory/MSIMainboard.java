package com.rongpengli.designpattern._7AbstractFactory;

public class MSIMainboard implements MainboardApi {
    private int pins = 0;

    public MSIMainboard(int pins) {
        this.pins = pins;
    }

    @Override
    public void installCPU() {
        System.out.println("Now in MSIMainboard, cpuHoles=" + pins);
    }

}
