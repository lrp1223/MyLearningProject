package com.rongpengli.designpattern._6FactoryMethod;

public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMehod() {
        return new ExportDB();
    }

}
