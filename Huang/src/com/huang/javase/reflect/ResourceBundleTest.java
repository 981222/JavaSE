package com.huang.javase.reflect;

import java.util.ResourceBundle;

//java.util包下。提供了一个资源绑定器。便于获取属性配置文件中的内容。
//属性配置文件必须放在类路径下。
public class ResourceBundleTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        ResourceBundle bundle = ResourceBundle.getBundle("classinfo");

        String className = bundle.getString("className");
        Class c = Class.forName(className);
        c.newInstance();
    }
}
