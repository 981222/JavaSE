package com.huang.javase.reflect;

public class UserServer {

    public boolean login(String name, String password) {
        if("admin".equals(name) && "123".equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public void logout() {
        System.out.println("系统已经安全退出!");
    }
}
