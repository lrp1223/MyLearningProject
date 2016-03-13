package com.rongpengli.designpattern._22Decorator;

import java.sql.Date;

/**
 * 计算奖金的组件接口
 *
 * @author rongpengli
 *
 */
public abstract class Component {
    public abstract double calcPrize(String user, Date begin, Date end);
}
