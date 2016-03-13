package com.rongpengli.designpattern._24Bridge;

/**
 * 抽象的消息对象
 *
 * @author rongpengli
 *
 */
public abstract class AbstractMessage {
    protected MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    public void sendMessage(String message, String toUser) {
        implementor.send(message, toUser);
    }
}
