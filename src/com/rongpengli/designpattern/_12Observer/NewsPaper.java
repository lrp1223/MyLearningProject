package com.rongpengli.designpattern._12Observer;

public class NewsPaper extends Subject {
    private String content;

    public String getContent() {
        return content;
    }

    // 出版报纸
    public void setContent(String content) {
        this.content = content;
        notifyObservers();
    }
}
