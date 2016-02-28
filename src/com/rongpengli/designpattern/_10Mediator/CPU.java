package com.rongpengli.designpattern._10Mediator;

public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }

    private String videoData = "";
    private String soundData = "";

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void executeData(String data) {
        String[] strings = data.split(",");
        videoData = strings[0];
        soundData = strings[1];

        getMediator().changed(this);
    }
}
