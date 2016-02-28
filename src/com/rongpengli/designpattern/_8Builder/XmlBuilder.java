package com.rongpengli.designpattern._8Builder;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        buffer.append("<Report>\n");
        buffer.append("<Header>\n");
        buffer.append("<DepId>" + ehm.getDepId() + "</DepId>\n");
        buffer.append("<ExportData>" + ehm.getExportDate() + "</ExportData>\n");
        buffer.append("</Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDateModel>> mapData) {
        buffer.append("<body>\n");
        for (String tblName : mapData.keySet()) {
            buffer.append("<Datas TableName=\"" + tblName + "\">\n");
            for (ExportDateModel edm : mapData.get(tblName)) {
                buffer.append("<Data>\n");
                buffer.append("<Product>" + edm.getProductId() + "</Product>\n");
                buffer.append("<Price>" + edm.getPrice() + "</Price>\n");
                buffer.append("<Amount>" + edm.getAmount() + "</Amount>\n");
                buffer.append("</Data>\n");
            }
            buffer.append("</Datas>\n");
        }
        buffer.append("</Body>\n");
    }

    @Override
    public void buildFooter(ExportFooterModel efm) {
        buffer.append("<Footer>\n");
        buffer.append("<ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        buffer.append("</Footer>\n");
        buffer.append("</Report>\n");
    }

    public StringBuffer getResult() {
        return buffer;
    }
}
