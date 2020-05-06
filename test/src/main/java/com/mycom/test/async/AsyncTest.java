package com.mycom.test.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：songdalin
 * @date ：2020-05-06 下午 07:19
 * @description：
 * @modified By：
 * @version: 1.0
 */
@RestController
@RequestMapping("/async")
public class AsyncTest {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/get")
    public void test(){
        System.out.println("------开始-------");
        asyncService.sysout();
        System.out.println("------结束-------");
    }


}
