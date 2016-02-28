package com.rongpengli.designpattern._9Prototype;

public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        orderProductNum = num;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder [enterpriseName=" + enterpriseName + ", productId=" + productId
                + ", orderProductNum=" + orderProductNum + "]";
    }

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(enterpriseName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }

}
