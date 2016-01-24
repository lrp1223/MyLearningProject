package com.rongpengli.designpattern._4Adapter.real;

import java.util.List;

public interface LogDBOperateApi {
    public void createLog(LogModel lm);

    public void updateLog(LogModel lm);

    public void removeLog(LogModel lm);

    public List<LogModel> getAllLog();
}
