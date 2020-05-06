package com.mycom.test.cookieandsession.login.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

//import javax.validation.constraints.NotBlank;

/**
 * @author ：songdalin
 * @date ：2020-05-05 下午 04:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginInfo {

    @NotBlank
    private String userid;

    @NotBlank
    private String password;

    private String token;
}
