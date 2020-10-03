package com.huang.javase.exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        MyException e = new MyException("用户名不能为空！");
        e.printStackTrace();
    }
}
