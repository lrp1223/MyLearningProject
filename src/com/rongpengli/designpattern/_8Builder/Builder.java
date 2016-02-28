package com.rongpengli.designpattern._8Builder;

import java.util.Collection;
import java.util.Map;

public interface Builder {
    public void buildHeader(ExportHeaderModel ehm);

    public void buildBody(Map<String, Collection<ExportDateModel>> mapData);

    public void buildFooter(ExportFooterModel efm);
}
