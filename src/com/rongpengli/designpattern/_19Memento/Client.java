package com.rongpengli.designpattern._19Memento;

public class Client {

    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("TestFlow");
        mock.runPhaseOne();

        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        FlowAMockMemento memento = mock.createMemento();
        careTaker.saveMemento(memento);

        mock.schema1();

        mock.setMemento(careTaker.retriveMemento());
        mock.schema2();
    }

}
