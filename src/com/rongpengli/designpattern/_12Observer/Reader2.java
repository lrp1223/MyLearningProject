package com.rongpengli.designpattern._12Observer;

import java.util.Observable;
import java.util.Observer;

public class Reader2 implements Observer {
    private String name;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到了报纸，阅读先。目标推送过来的内容是===" + arg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
