package com.mycom.test.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycom.test.jackson.pojo.Book;
import com.mycom.test.jackson.pojo.Student;
import com.mycom.test.jackson.util.JsonUtil;

import java.util.Arrays;

/**
 * @author ：songdalin
 * @date ：2020-05-08 下午 07:18
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class JacksonTest {

    public static void main(String[] args){

        Book book1 = new Book();
        book1.setBookName("语文");
        book1.setBookPrice(20.3);
        Book book2 = new Book();
        book2.setBookName("数学");
        book2.setBookPrice(30.0);

        Student student = new Student();
        student.setAge(18);
        student.setName("小米");
        student.setBookList(Arrays.asList(book1,book2));

        ObjectMapper objectMapper = new ObjectMapper();
        String str = null;
        String strFormat = null;
        try {
            str = objectMapper.writeValueAsString(student);
            strFormat = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println("标准输出：");
        System.out.println(str);
        System.out.println("格式化输出:");
        System.out.println(strFormat);


        String jsonStr = "{\"age\":18,\"name\":\"小米\",\"bookList\":[{\"bookName\":\"语文\",\"bookPrice\":20.3},{\"bookName\":\"数学\",\"bookPrice\":30.0}]}";

        Student student1 = null;
        try {
            student1 = objectMapper.readValue(jsonStr, Student.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        //System.out.println(student1.toString());

        String a = "111";
        String b = null;
        try {
            b = objectMapper.writeValueAsString(a);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(b);

        System.out.println(JsonUtil.);
    }
}
