package com.rongpengli.designpattern._6FactoryMethod;

public abstract class ExportOperate {
    public boolean export(String data) {
        ExportFileApi api = factoryMehod();
        return api.export(data);
    }

    protected abstract ExportFileApi factoryMehod();
}
