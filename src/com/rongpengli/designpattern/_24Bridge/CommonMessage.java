package com.rongpengli.designpattern._24Bridge;

public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }

}
