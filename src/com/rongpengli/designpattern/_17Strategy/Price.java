package com.rongpengli.designpattern._17Strategy;

public class Price {
    private final Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}
