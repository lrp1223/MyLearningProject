package com.rongpengli.designpattern._10Mediator;

public class Client {

    public static void main(String[] args) {
        // 创建中介者--主板对象
        MethodBoard mediator = new MethodBoard();

        // 创建同事类
        CDDriver cdDriver = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);

        // 让中介者知道所有的同事
        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setVideoCard(videoCard);
        mediator.setSoundCard(soundCard);

        // 开始看电影，把光盘放入光驱，光驱开始读盘
        cdDriver.readCD();
    }

}
