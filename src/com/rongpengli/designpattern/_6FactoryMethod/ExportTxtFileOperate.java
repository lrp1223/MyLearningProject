package com.rongpengli.designpattern._6FactoryMethod;

public class ExportTxtFileOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMehod() {
        return new ExportTxtFile();
    }

}
