package com.rongpengli.designpattern._8Builder;

public class Client {
    public static void main(String[] args) {
        TxtBuilder txtBuilder = new TxtBuilder();

        Director director = new Director(txtBuilder);
        // Dummy, not implemented
        director.construct(null, null, null);
        System.out.println(txtBuilder.getResult());
    }
}
