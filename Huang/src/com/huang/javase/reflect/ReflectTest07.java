package com.huang.javase.reflect;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.huang.javase.reflect.Student");
        Student obj = (Student)c.newInstance();
        obj.age = 123;
        System.out.println(obj.age);
//        //获取no属性
//        Field noField = c.getDeclaredField("no");
//
//        //给obj对象的no属性赋值
//        //赋值：三个要素：对像，属性，值
//        noField.set(obj,123);
//        //获取：两个要素：对象，属性
//        System.out.println(noField.get(obj));
//
//        //可以访问私有变量嘛？
//        Field nameField = c.getDeclaredField("name");
//
//        //打破封装,反射机制的缺点：打破封装，可能会给不法分子留下机会。
//        //这样设置完之后，外部也可以访问私有变量。
//        nameField.setAccessible(true);
//
//        nameField.set(obj,"json");
//        System.out.println(nameField.get(obj));
    }
}
