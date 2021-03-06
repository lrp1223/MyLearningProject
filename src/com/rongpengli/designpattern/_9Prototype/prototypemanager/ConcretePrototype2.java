package com.rongpengli.designpattern._9Prototype.prototypemanager;

public class ConcretePrototype2 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(name);
        return prototype;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2 [name=" + name + "]";
    }

}
