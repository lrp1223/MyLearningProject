package com.rongpengli.designpattern._7AbstractFactory;

public class Client {

    public static void main(String[] args) {
        ComputerEngineer engineer = new ComputerEngineer();
        AbstractFactory schema = new Schema1();
        engineer.makeComputer(schema);
    }

}
