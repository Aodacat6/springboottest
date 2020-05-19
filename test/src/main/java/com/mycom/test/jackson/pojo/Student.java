package com.mycom.test.jackson.pojo;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author ：songdalin
 * @date ：2020-05-08 下午 07:12
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student implements Serializable {

    private int age;

    private String name;

    private List<Book> bookList;
}
