package com.rongpengli.designpattern._16TemplateMethod;

public class WorkLogin extends LoginTemplate {

    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId(loginId);
        loginModel.setPwd("workerPwd");
        return loginModel;
    }

    @Override
    public String encryptPwd(String pwd) {
        System.out.println("Use MD5 to encrypt");
        return pwd;
    }

}
