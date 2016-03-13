package com.rongpengli.designpattern._24Bridge;

public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("用Email的方式，发送消息'" + message + "'给'" + toUser + "'");
    }

}
