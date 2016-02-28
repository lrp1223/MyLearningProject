package com.rongpengli.designpattern._9Prototype;

public interface OrderApi {
    public int getOrderProductNum();

    public void setOrderProductNum(int num);

    public OrderApi cloneOrder();
}
