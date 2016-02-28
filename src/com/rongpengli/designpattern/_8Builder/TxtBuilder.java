package com.rongpengli.designpattern._8Builder;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDateModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            buffer.append(tblName + "\n");
            for (ExportDateModel edm : mapData.get(tblName)) {
                buffer.append(
                        edm.getProductId() + "," + edm.getPrice() + "," + edm.getAmount() + "\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
