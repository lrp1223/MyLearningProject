package com.rongpengli.designpattern._9Prototype.javaclone;

public class PersonalOrder implements Cloneable, OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int num) {
        orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "PersonalOrder [customerName=" + customerName + ", productId=" + productId
                + ", orderProductNum=" + orderProductNum + "]";
    }

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

}
