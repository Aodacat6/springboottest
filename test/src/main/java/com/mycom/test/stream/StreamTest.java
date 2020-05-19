package com.mycom.test.stream;

import com.mycom.test.jackson.pojo.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ：songdalin
 * @date ：2020-05-17 上午 10:32
 * @description：stream学习
 * @modified By：
 * @version: 1.0
 */
public class StreamTest {
    /**
     *
     * 中间操作
     * stream的筛选与切片
     * 1 fliter
     * 2 limit
     * 3 skip
     * 4 distinct
     */
    public static void main(String[] args){

        List<Student> list = Arrays.asList(new Student(12,"xiao",null),
                new Student(88,"wang",null),
                new Student(34,"li",null),
                new Student(4,"zhang",null));

        Stream<Student> stream = list.stream().filter(e -> {
            System.out.println("执行了一次");
            return e.getAge()>10;
        }).filter(e -> e.getName().length() > 3).limit(2);

        stream.forEach(System.out::println);
    }


}
