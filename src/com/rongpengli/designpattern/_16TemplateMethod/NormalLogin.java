package com.rongpengli.designpattern._16TemplateMethod;

public class NormalLogin extends LoginTemplate {

    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId(loginId);
        loginModel.setPwd("testPwd");
        return loginModel;
    }

}
