package com.rongpengli.designpattern._22Decorator;

import java.sql.Date;

public abstract class Decorator extends Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return component.calcPrize(user, begin, end);
    }
}
