package com.rongpengli.designpattern._16TemplateMethod;

public abstract class LoginTemplate {
    /**
     * 判断登录数据是否正确，也就是是否能登录成功
     *
     * @param loginModel
     * @return
     */
    public final boolean login(LoginModel loginModel) {
        LoginModel dbLoginModel = findLoginUser(loginModel.getLoginId());
        if (dbLoginModel != null) {
            String encryptPwd = encryptPwd(loginModel.getPwd());
            loginModel.setPwd(encryptPwd);
            return match(loginModel, dbLoginModel);
        }
        return false;
    }

    /**
     * 根据登录编号来查找和获取存储中相应的数据
     *
     * @param loginId
     * @return
     */
    public abstract LoginModel findLoginUser(String loginId);

    public String encryptPwd(String pwd) {
        return pwd;
    }

    public boolean match(LoginModel loginModel, LoginModel dbLoginModel) {
        if (loginModel.getLoginId().equals(dbLoginModel.getLoginId())
                && loginModel.getPwd().equals(dbLoginModel.getPwd())) {
            return true;
        }
        return false;
    }
}
