package com.rongpengli.designpattern._6FactoryMethod;

public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        operate.export("Test Data");
    }

}
