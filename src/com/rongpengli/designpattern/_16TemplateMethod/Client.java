package com.rongpengli.designpattern._16TemplateMethod;

public class Client {

    public static void main(String[] args) {
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId("Admin");
        loginModel.setPwd("workerPwd");

        LoginTemplate loginTemplate1 = new WorkLogin();
        LoginTemplate loginTemplate2 = new NormalLogin();

        boolean flag = loginTemplate1.login(loginModel);
        System.out.println("可以登录工作平台=" + flag);

        boolean flag2 = loginTemplate2.login(loginModel);
        System.out.println("可以进行普通人员扥估=" + flag2);
    }

}
