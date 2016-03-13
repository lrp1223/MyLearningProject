package com.rongpengli.designpattern._24Bridge;

/**
 * 实现发送消息的统一接口
 * 
 * @author rongpengli
 *
 */
public interface MessageImplementor {
    public void send(String message, String toUser);
}
