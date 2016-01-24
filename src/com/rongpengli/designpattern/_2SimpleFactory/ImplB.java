package com.rongpengli.designpattern._2SimpleFactory;

public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s==" + s);
    }
}
