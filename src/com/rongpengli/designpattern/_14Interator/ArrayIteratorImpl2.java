package com.rongpengli.designpattern._14Interator;

import java.util.Iterator;

public class ArrayIteratorImpl2 implements Iterator<Object> {
    private SalaryManager aggregate = null;

    private int index = 0;

    public ArrayIteratorImpl2(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (aggregate != null && index < aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object retObj = null;
        if (hasNext()) {
            retObj = aggregate.get(index);
            index++;
        }
        return retObj;
    }

    @Override
    public void remove() {

    }
}
