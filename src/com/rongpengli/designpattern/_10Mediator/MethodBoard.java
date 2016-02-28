package com.rongpengli.designpattern._10Mediator;

public class MethodBoard implements Mediator {
    private CDDriver cdDriver = null;
    private CPU cpu = null;
    private VideoCard videoCard = null;
    private SoundCard soundCard = null;

    @Override
    public void changed(Colleague colleague) {
        if (colleague == cdDriver) {
            opeCDDriverReadData((CDDriver) colleague);
        } else if (colleague == cpu) {
            opeCPU((CPU) colleague);
        }
    }

    // 处理光驱读取数据以后与其他对象的交互
    private void opeCDDriverReadData(CDDriver cd) {
        String data = cd.getData();
        cpu.executeData(data);
    }

    private void opeCPU(CPU cpu) {
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();

        videoCard.showData(videoData);
        soundCard.soundData(soundData);
    }

    public CDDriver getCdDriver() {
        return cdDriver;
    }

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

}
