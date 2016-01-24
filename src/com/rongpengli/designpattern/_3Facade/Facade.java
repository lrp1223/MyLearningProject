package com.rongpengli.designpattern._3Facade;

public class Facade {
    public void test() {
        AModuleApi a = new AModuleImpl();
        a.testA();
        BModuleApi b = new BModuleImpl();
        b.testB();
    }
}
