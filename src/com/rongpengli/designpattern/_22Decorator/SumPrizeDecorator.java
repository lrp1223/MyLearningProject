package com.rongpengli.designpattern._22Decorator;

import java.sql.Date;

/**
 * 装饰器对象，计算累计奖金
 *
 * @author rongpengli
 *
 */
public class SumPrizeDecorator extends Decorator {

    public SumPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);

        double prize = 1000000 * 0.001;
        return money + prize;
    }
}
