package com.rongpengli.designpattern._14Interator;

public class Client {

    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表：");
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的公司工资列表");
        test(salaryManager.createIterator());
    }

    private static void test(Iterator it) {
        it.first();
        while (!it.isDone()) {
            Object object = it.currentItem();
            System.out.println("the obj==" + object);
            it.next();
        }
    }

}
