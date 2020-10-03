package com.huang.javase.String;

public class UserTest {
    public static void main(String[] args) {
        //张三先在方法区中的字符串常量池中创建出来。之后传入new出来的对象中保存内存地址。
        User user = new User(110, "张三");

    }
}
