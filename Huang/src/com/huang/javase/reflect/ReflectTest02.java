package com.huang.javase.reflect;

/*
获取class可以干什么？
    通过Class的newInstance()方法来实例化对象。
    注意：newInstance()方法内部实际上调用了对象的无参构造，必须保证无参构造存在才行。
*/
public class ReflectTest02 {
    public static void main(String[] args) {
        //不反射机制创建对象。
        User user = new User();
        System.out.println(user);

        //通过反射机制获取class，通过class来实例化对象
        try {
            Class u1 = Class.forName("com.huang.javase.reflect.User");
            System.out.println(u1.newInstance());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
