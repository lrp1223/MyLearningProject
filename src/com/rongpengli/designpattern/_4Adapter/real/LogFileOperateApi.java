package com.rongpengli.designpattern._4Adapter.real;

import java.util.List;

public interface LogFileOperateApi {
    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);
}
