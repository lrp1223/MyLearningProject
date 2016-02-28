package com.rongpengli.designpattern._9Prototype.prototypemanager;

public interface Prototype {
    public Prototype clone();

    public String getName();

    public void setName(String name);
}
