package com.rongpengli.designpattern._4Adapter.real;

import java.util.List;

public class Adapter implements LogDBOperateApi {
    private final LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeLog(LogModel lm) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<LogModel> getAllLog() {
        // TODO Auto-generated method stub
        return null;
    }

}
