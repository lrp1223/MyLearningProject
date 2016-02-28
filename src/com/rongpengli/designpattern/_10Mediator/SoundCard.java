package com.rongpengli.designpattern._10Mediator;

/**
 * 声卡类
 * 
 * @author rongpengli
 *
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    // 按照声频数据发出声音
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
