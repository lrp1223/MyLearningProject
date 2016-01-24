package com.rongpengli.designpattern._3Facade;

public class AModuleImpl implements AModuleApi {

    @Override
    public void testA() {
        System.out.println("Inside module A, function testA.");
    }

}
