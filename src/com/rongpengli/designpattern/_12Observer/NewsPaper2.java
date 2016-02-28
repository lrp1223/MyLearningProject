package com.rongpengli.designpattern._12Observer;

import java.util.Observable;

public class NewsPaper2 extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        setChanged();
        this.notifyObservers(this.content);
    }

}
