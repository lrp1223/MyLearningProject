package com.rongpengli.designpattern._17Strategy;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new LargeCustomerStrategy();

        Price price = new Price(strategy);

        double quote = price.quote(1000);
        System.out.println("向客户报价：" + quote);
    }

}
