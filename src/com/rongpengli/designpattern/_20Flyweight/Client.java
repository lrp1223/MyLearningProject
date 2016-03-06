package com.rongpengli.designpattern._20Flyweight;

public class Client {

    public static void main(String[] args) {
        SecurityMgr securityMgr = SecurityMgr.getInstance();
        securityMgr.login("张三");
        securityMgr.login("李四");

        boolean f1 = securityMgr.hasPermit("张三", "薪资数据", "查看");
        boolean f2 = securityMgr.hasPermit("李四", "薪资数据", "查看");

        System.out.println("f1==" + f1);
        System.out.println("f2==" + f2);
        for (int i = 0; i < 3; i++) {
            securityMgr.login("张三" + i);
        }
    }

}
