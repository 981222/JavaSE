package com.huang.javase.reflect;

import java.lang.reflect.Constructor;

//反射机制创建对象
public class ReflectTest11 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.huang.javase.reflect.Vip");
        //无参构造。
        Object obj = c.newInstance();
        //调用有参。
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        Object newObj = con.newInstance(110,"huang","1999-02-25",true);
        System.out.println(newObj);
    }
}
