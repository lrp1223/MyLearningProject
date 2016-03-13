package com.rongpengli.designpattern._23ChainofResponsibility;

public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String string = "";
        if (fee >= 1000) {
            if ("小李".equals(user)) {
                string = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                string = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return string;
        } else {
            if (successor != null) {
                return successor.handleFeeRequest(user, fee);
            }
        }
        return string;
    }

}
