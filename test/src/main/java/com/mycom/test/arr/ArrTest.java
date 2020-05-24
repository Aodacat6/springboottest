package com.mycom.test.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：songdalin
 * @date ：2020-05-24 下午 03:54
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ArrTest {

    public static void main(String[] args){

        List list = new ArrayList();
        list.addAll(Arrays.asList( 1,2,3,4));
        list.add(2, 777);
        System.out.println(list);
    }
}
