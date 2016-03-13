package com.rongpengli.designpattern._23ChainofResponsibility;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * 
     * @param user
     * @param fee
     * @return
     */
    public abstract String handleFeeRequest(String user, double fee);
}
