package com.rongpengli.designpattern._24Bridge;

public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
