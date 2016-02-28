package com.rongpengli.designpattern._7AbstractFactory;

public interface AbstractFactory {
    public CPUApi createCPUApi();

    public MainboardApi createMainboardApi();
}
