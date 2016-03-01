package com.rongpengli.designpattern._14Interator;

public interface Iterator {
    public void first();

    public void next();

    public boolean isDone();

    public Object currentItem();
}
