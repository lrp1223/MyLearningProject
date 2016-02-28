package com.rongpengli.designpattern._6FactoryMethod;

public class ExportDB implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("Export data to DB:" + data);
        return true;
    }

}
