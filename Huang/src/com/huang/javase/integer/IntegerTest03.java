package com.huang.javase.integer;

public class IntegerTest03 {
    public static void main(String[] args) {

        //JDK9后就过时了。不建议使用。
        //Integer 2种构造方法。 传int 或 String
        Integer i = new Integer(100);
        Integer O = new Integer("200");

        //通过访问包装类的常量获取最大值最小值。
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }

}
