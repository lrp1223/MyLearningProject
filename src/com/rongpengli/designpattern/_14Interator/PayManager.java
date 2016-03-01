package com.rongpengli.designpattern._14Interator;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户方已有的工资管理对象
 *
 * @author rongpengli
 *
 */
public class PayManager extends Aggregate {
    private final List<PayModel> list = new ArrayList<PayModel>();

    public List<PayModel> getPayList() {
        return list;
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }

    public int size() {
        return list.size();
    }

    public void calcPay() {
        PayModel pm1 = new PayModel();
        pm1.setPay(3800);
        pm1.setUserName("张三");

        PayModel pm2 = new PayModel();
        pm2.setPay(5800);
        pm2.setUserName("李四");

        list.add(pm1);
        list.add(pm2);
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < list.size()) {
            retObj = list.get(index);
        }
        return retObj;
    }
}
