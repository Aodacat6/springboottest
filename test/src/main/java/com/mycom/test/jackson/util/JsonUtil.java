package com.mycom.test.jackson.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @author ：songdalin
 * @date ：2020-05-08 下午 07:18
 * @description： 单例模式实现ObjectMapper工具类
 * @modified By：
 * @version: 1.0
 */
@Slf4j
public final class JsonUtil {

    private JsonUtil(){}

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> String obj2String(T obj){
        if(obj == null){
            return "";
        }
        try {
            return obj instanceof String ? (String)obj : objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.error(e.toString());
        }
        return "";
    }

    public static <T> T string2Obj(String str, Class<T> clazz){
        if (str == null || clazz == null || StringUtils.isEmpty(str)){
            return null;
        }
        try {
            return clazz.equals(String.class) ? (T)str : objectMapper.readValue(str, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
