package com.rongpengli.designpattern._14Interator;

public class ArrayIteratorImpl implements Iterator {
    private SalaryManager aggregate = null;

    private int index = -1;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < aggregate.size()) {
            index += 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(index);
    }

}
