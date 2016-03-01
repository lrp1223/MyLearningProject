package com.rongpengli.designpattern._16TemplateMethod;

public class LoginModel {
    // 登录人员编号，通用的，可能是用户编号，也可能是工作人员编号
    private String loginId;

    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
