package com.rongpengli.designpattern._10Mediator;

/**
 * 显卡类
 *
 * @author rongpengli
 *
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    // 显示视频数据
    public void showData(String data) {
        System.out.println("您正观看的是：" + data);
    }
}
