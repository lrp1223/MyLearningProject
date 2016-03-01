package com.rongpengli.designpattern._14Interator;

/**
 * 被客户方收购的那个公司的工资管理类
 *
 * @author rongpengli
 *
 */
public class SalaryManager extends Aggregate {
    private PayModel[] payModels = null;

    public PayModel[] getPays() {
        return payModels;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < payModels.length) {
            retObj = payModels[index];
        }
        return retObj;
    }

    public void calcSalary() {
        PayModel pm1 = new PayModel();
        pm1.setPay(2200);
        pm1.setUserName("王五");

        PayModel pm2 = new PayModel();
        pm2.setPay(3600);
        pm2.setUserName("赵六");

        payModels = new PayModel[2];
        payModels[0] = pm1;
        payModels[1] = pm2;
    }

    public int size() {
        return payModels.length;
    }
}
