package com.rongpengli.designpattern._17Strategy;

public class NormalCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或普通客户，没有折扣");
        return goodsPrice;
    }

}
