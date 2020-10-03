package com.huang.javase.review;

import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        //创建对象
        Properties pro = new Properties();

        //存
        pro.setProperty("name","huangsongren");
        pro.setProperty("age","21");

        //取
        System.out.println(pro.getProperty("name"));
        System.out.println(pro.getProperty("age"));

    }
}
