/**
 *
 */
package com.imooc.security.core.properties;

/**
 * @author zhailiang
 *
 */
public class BrowserProperties {


    private String loginPage = "/imooc-singIn.html";

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
