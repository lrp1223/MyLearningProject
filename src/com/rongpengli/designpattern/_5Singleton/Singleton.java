package com.rongpengli.designpattern._5Singleton;

//懒汉模式
public class Singleton {
    private static Singleton uniqueInstance = null;

    // private constructor
    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
