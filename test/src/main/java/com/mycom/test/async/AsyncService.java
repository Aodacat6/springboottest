package com.mycom.test.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author ：songdalin
 * @date ：2020-05-06 下午 07:37
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Service
public class AsyncService {

    /**
     *
     *
     * async异步失效常见原因
     * 1、springboot启动类没加异步启动注解
     * 2、@async方法必须由spring容器注入，不能直接调用
     * 3、@asunc方法必须返回void或future
     *https://blog.csdn.net/YoungLee16/article/details/88398045
     *
     *
     *
     *
     */
    @Async
    public void sysout(){
/*        for (int i=0; i<100000000; i++){

        }*/
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------async--------------");
    }
}
