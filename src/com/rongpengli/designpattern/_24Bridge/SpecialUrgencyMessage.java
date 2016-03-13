package com.rongpengli.designpattern._24Bridge;

public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    public void hurry(String messageId) {
        // 执行催促的业务，发出催促的信息
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

}
