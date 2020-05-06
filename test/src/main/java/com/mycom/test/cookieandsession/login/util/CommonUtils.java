package com.mycom.test.cookieandsession.login.util;

import com.mycom.test.cookieandsession.login.vo.LoginInfo;

import java.util.Objects;

/**
 * @author ：songdalin
 * @date ：2020-05-05 下午 04:24
 * @description：
 * @modified By：
 * @version: 1.0
 */
public final class CommonUtils {

    private CommonUtils(){}

    public static boolean checkUser(LoginInfo loginInfo){
        if (Objects.isNull(loginInfo)){
            return false;
        }
        if ("admin".equals(loginInfo.getUserid()) && "123456".equals(loginInfo.getPassword())){
            return true;
        }
        return false;
    }

}
