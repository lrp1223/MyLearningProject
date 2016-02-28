package com.rongpengli.designpattern._11Proxy;

public class Proxy implements UserModelApi {
    private UserModel realSubject = null;

    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        if (!loaded) {
            reload();
            loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (!loaded) {
            reload();
            loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    private void reload() {
        System.out.println("重新查询数据库，获取完整的用户数据，userId==" + realSubject.getUserId());

        // DB operation
        realSubject.setDepId("");
        realSubject.setSex("");
    }

    @Override
    public String toString() {
        return "userId=" + realSubject.getUserId() + ",name=" + realSubject.getName() + ",depId="
                + realSubject.getDepId() + ",sex=" + realSubject.getSex() + "\n";
    }
}
