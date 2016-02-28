package com.rongpengli.designpattern._12Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> readers = new ArrayList<Observer>();

    public void attach(Observer reader) {
        readers.add(reader);
    }

    public void detach(Observer reader) {
        readers.remove(reader);
    }

    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }
}
