package com.rongpengli.designpattern._9Prototype.prototypemanager;

public class ConcretePrototype1 implements Prototype {
    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype1 prototype = new ConcretePrototype1();
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
        return "ConcretePrototype1 [name=" + name + "]";
    }

}
