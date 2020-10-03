package com.huang.javase.reflect;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

/*
验证反射机制的灵活：
    java代码写一遍，在不改变java源代码的基础上，可以做到不同对象的实力化。
    非常之灵活。（符合OCP开闭原则：对扩展开放，对修改关闭。）
*/
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        //这种方式就写死了。
        //User user = new User();

        //使用class方法创建的对象可以不改动源代码的情况下更改使用类。
        //通过IO流读取classinfo.properties文件。

        //返回路径
        //String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        //FileReader reader = new FileReader(path);

        //直接返回流
        InputStream in = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("classinfo.properties");

        Properties pro = new Properties();
        pro.load(in);
        //reader.close();
        in.close();
        String className = pro.getProperty("className");
        Class c = Class.forName(className);
        System.out.println(c.newInstance());

    }
}
