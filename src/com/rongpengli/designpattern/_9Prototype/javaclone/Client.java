package com.rongpengli.designpattern._9Prototype.javaclone;

public class Client {
    public static void main(String[] args) {
        PersonalOrder oa1 = new PersonalOrder();
        oa1.setOrderProductNum(100);
        System.out.println(oa1.getOrderProductNum() + "======");

        PersonalOrder oa2 = (PersonalOrder) oa1.clone();
        oa2.setOrderProductNum(80);
        System.out.println(oa2.getOrderProductNum() + "======");

        System.out.println(oa1.getOrderProductNum() + "======");
    }

}
