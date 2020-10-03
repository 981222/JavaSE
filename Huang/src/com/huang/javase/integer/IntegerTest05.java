package com.huang.javase.integer;

public class IntegerTest05 {
    public static void main(String[] args) {
        Integer i = new Integer("123");
        //以上方法传入 字符串数字时 会调用内部的  Integer.parseInt() 方法，将字符串转换为int类型
        //各类基本类型相似。 Double.parseDouble(“字符串”) 等待...
        //E.g
        System.out.println(Integer.parseInt("123123"));
    }
}
