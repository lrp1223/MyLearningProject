package com.rongpengli.designpattern._22Decorator;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Client {

    public static void main(String[] args) {
        // 先创建计算基本奖金的类，被装饰的对象
        Component c1 = new ConcreteComponent();

        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(d1);

        double zs = d2.calcPrize("张三", null, null);
        System.out.println("====张三应得奖金：" + zs);

        double ls = d2.calcPrize("李四", null, null);
        System.out.println("====李四应得奖金：" + ls);

        Decorator d3 = new GroupPrizeDecorator(d2);
        double ww = d3.calcPrize("王五", null, null);
        System.out.println("====王经历应得奖金：" + ww);

        // Test EncryptOutputStream
        try {
            DataOutputStream dout = new DataOutputStream(
                    new EncryptOutputStream(new FileOutputStream("test.txt")));
            dout.write("abcdxyz".getBytes());
            dout.close();
        } catch (Exception e) {
        }
    }

}
