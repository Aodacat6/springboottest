package com.mycom.test.singleton;

import com.mycom.test.jackson.pojo.Student;

/**
 * @author ：songdalin
 * @date ：2020-05-11 下午 06:27
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class StudentSingleton {

    private static Student student = null;

    private StudentSingleton(){}

    public static Student getStudent(){
        if (student == null){
            student = new Student();
        }
        return student;
    }
}
