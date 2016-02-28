package com.rongpengli.designpattern._9Prototype;

public class OrderBusiness {
    public void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > 1000) {
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);

            order.setOrderProductNum(order.getOrderProductNum() - 1000);
        }
    }
}
