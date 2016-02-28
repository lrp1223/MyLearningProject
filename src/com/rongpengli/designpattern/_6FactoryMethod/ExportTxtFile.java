package com.rongpengli.designpattern._6FactoryMethod;

public class ExportTxtFile implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("Export data to txt:" + data);
        return true;
    }

}
