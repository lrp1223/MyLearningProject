package com.rongpengli.designpattern._2SimpleFactory;

public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("Using simple factory.");

        Api api2 = Factory.createApi2();
        api2.operation("test");
    }

}
