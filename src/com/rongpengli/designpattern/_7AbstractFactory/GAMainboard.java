package com.rongpengli.designpattern._7AbstractFactory;

public class GAMainboard implements MainboardApi {
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Now in GAMainboard, cpuHoles=" + cpuHoles);
    }

}
