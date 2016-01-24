package com.rongpengli.designpattern._5Singleton;

public class Singleton3 {
    // 类级内部类，静态的成员式内部类；
    private static class SingletonHolder {
        private static Singleton3 instance = new Singleton3();
    }

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }
}
