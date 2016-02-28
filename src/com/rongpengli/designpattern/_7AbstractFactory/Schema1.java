package com.rongpengli.designpattern._7AbstractFactory;

public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }

}
