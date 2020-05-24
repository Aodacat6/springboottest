package com.mycom.test.args;

import com.mycom.test.jackson.pojo.Student;

/**
 * @author ：songdalin
 * @date ：2020-05-19 上午 09:19
 * @description：入参修改
 * @modified By：
 * @version: 1.0
 */
public class ArgTest {

    public void test(Student student){

        student.setName(student.getName() + "111");
    }

    public static void main(String[] args){
        Student a = new Student(11,"ming",  null);
        ArgTest argTest = new ArgTest();
        argTest.test(a);
        System.out.println(a);
    }
}
