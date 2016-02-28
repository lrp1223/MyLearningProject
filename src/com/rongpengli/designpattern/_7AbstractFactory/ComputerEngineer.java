package com.rongpengli.designpattern._7AbstractFactory;

public class ComputerEngineer {
    private CPUApi cpuApi = null;
    private MainboardApi mainboardApi = null;

    public void makeComputer(AbstractFactory schema) {
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema) {
        cpuApi = schema.createCPUApi();
        mainboardApi = schema.createMainboardApi();

        cpuApi.calculate();
        mainboardApi.installCPU();
    }
}
