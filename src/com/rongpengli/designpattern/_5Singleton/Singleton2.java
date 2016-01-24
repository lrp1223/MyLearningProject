package com.rongpengli.designpattern._5Singleton;

//饿汉模式
public class Singleton2 {
    private static Singleton2 uniqueSingleton = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return uniqueSingleton;
    }
}
