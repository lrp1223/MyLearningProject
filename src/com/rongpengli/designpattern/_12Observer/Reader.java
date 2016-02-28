package com.rongpengli.designpattern._12Observer;

public class Reader implements Observer {
    private String name;

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到了报纸，阅读它。内容是====" + ((NewsPaper) subject).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
