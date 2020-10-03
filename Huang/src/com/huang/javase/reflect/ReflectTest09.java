package com.huang.javase.reflect;

import java.lang.reflect.Method;

// 通过反射机制调用方法。
// 反射机制可以让代码很具有通用性。可变化的内容写在配置文件中。
// 可以通过修改配置文件达到创建不同对象，调用不同方法。
// 但是java源代码不需要任何改动。这就是反射机制的魅力。
public class ReflectTest09 {
    public static void main(String[] args) throws Exception {
        //普通调用
        UserServer userServer = new UserServer();
        System.out.println(userServer.login("admin","123") ? "登陆成功" : "登陆失败");

        //反射机制调用
        Class c = Class.forName("com.huang.javase.reflect.UserServer");
        Object obj = c.newInstance();

        //方法名可能会重载。
        //方法需要通过方法名和参数来区分。
        Method loginM = c.getDeclaredMethod("login",String.class, String.class);

        //要素：
        // obj 对象，
        // loginM 方法，
        // "admin","123" 实参列表，
        // retValue 返回值。
        Object retValue = loginM.invoke(obj,"admin","123");

        System.out.println(retValue);

    }
}
