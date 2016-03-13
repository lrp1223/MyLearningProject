package com.rongpengli.designpattern._24Bridge;

public class Client {
    public static void main(String[] args) {
        MessageImplementor implementor = new MessageSMS();
        AbstractMessage message = new CommonMessage(implementor);

        message.sendMessage("请喝一杯茶", "小李");

        message = new UrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");

        message = new SpecialUrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");

        // 实现方式切换成手机
        implementor = new MessageMobile();
        message = new CommonMessage(implementor);

        message.sendMessage("请喝一杯茶", "小李");

        message = new UrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");

        message = new SpecialUrgencyMessage(implementor);
        message.sendMessage("请喝一杯茶", "小李");
    }
}
