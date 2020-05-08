package com.mycom.test.jackson.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：songdalin
 * @date ：2020-05-08 下午 07:12
 * @description：
 * @modified By：
 * @version: 1.0
 */
@Data
public class Book implements Serializable {

    private String bookName;

    private Double bookPrice;
}
