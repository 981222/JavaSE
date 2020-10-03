package com.huang.javase.reflect;

/*
Class.forName 发生了什么?
    记住，重点：
        如果你只是希望一个类的静态代码块执行，其他代码一律不执行。
        你可以使用：
            Class.forName("完整类名");
         这个方法的执行会导致累类加载，类加载时，静态代码块执行。
     提示：后面JDBC技术的时候我们需要。
*/
public class ReflectTest04 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        try {
            //如果只执行类的静态代码块可以就一行代码。
            Class.forName("com.huang.javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    static {
        System.out.println("MyClass静态代码块执行了。");
    }
}