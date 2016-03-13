package com.rongpengli.designpattern._22Decorator;

import java.sql.Date;

public class ConcreteComponent extends Component {

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }

}
