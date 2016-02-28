package com.rongpengli.designpattern._10Mediator;

public abstract class Colleague {
    private final Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
