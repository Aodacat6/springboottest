package com.mycom.test.singleton;

import com.mycom.test.jackson.pojo.Student;

/**
 * @author ：songdalin
 * @date ：2020-05-11 下午 06:32
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SingletonTest {

    public static void main(String[] args){
        for (int i = 0; i < 19; i++)
        {
            Thread thread = new Thread(SingletonTest :: outStudent);
            thread.run();
        }

    }

    public static void outStudent(){
        System.out.println(StudentSingleton.getStudent());
    }
}
