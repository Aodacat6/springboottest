package com.mycom.test.jackson.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author ：songdalin
 * @date ：2020-05-08 下午 07:12
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
public class Student {

    private int age;

    private String name;

    private List<Book> bookList;
}