package com.mycom.test.cookieandsession.login;

import com.mycom.test.cookieandsession.login.util.CommonUtils;
import com.mycom.test.cookieandsession.login.vo.LoginInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Random;

/**
 * @author ：songdalin
 * @date ：2020-05-05 下午 04:05
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/cookieandsession")
public class CookieAndSessionTest {

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, @RequestBody @Validated LoginInfo loginInfo){
/*        LoginInfo loginInfo = LoginInfo.builder().userid(param.getOrDefault("userid", "").toString())
                .password(param.getOrDefault("password", "").toString())
                .build();*/
        if (!CommonUtils.checkUser(loginInfo)){
            return "fail,username or password is invalid ! ";
        }

        Cookie cookie = new Cookie("sessionId", String.valueOf(new Random().nextLong()));
        response.addCookie(cookie);

        return "success";
    }
    public static void main(String[] args){
        System.out.println(new Random().nextLong());
    }
}
