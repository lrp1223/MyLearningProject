package com.rongpengli.designpattern._10Mediator;

public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData() {
        return data;
    }

    public void readCD() {
        data = "设计模式,值得好好研究";
        getMediator().changed(this);
    }
}
