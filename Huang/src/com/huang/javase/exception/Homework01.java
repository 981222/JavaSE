package com.huang.javase.exception;

import java.util.Scanner;

//熟悉自定义异常的使用
public class Homework01 {
    public static void main(String[] args) {
        UserService u = new UserService();
        Scanner s = new Scanner(System.in);

        while (true){
            String username = s.next();
            String password = s.next();
            try {
                u.register(username, password);
            } catch (MyUserServiseInputException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

class MyUserServiseInputException extends Exception{

    public MyUserServiseInputException() {
    }

    public MyUserServiseInputException(String message) {
        super(message);
    }
}

class UserService {
    public void register(String username, String password) throws MyUserServiseInputException {
        //引用类型 == null 的最好放到所有条件的前面。
        if(username == null || username.length() < 6 || username.length() > 14){
            throw new MyUserServiseInputException("用户名不合法,长度必须在[6-14]之间!");
        }
        System.out.println("注册成功，欢迎[" + username + "]");
    }
}