package com.rongpengli.designpattern._4Adapter.real;

import java.util.List;

public class LogFileOperate implements LogFileOperateApi {
    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        return null;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        System.out.println(logFilePathName);
    }

}
