package com.huang.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{

        StringBuilder s = new StringBuilder();
        //获取整个类。
        Class c = Class.forName("java.lang.String");

        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + " {\n");
        //获取所有的field
        Field[] fs = c.getDeclaredFields();
        for (Field field:fs) {
            s.append("\t");
            //返回修饰列表
            String modifier = Modifier.toString(field.getModifiers());
            s.append(modifier + (modifier.length() == 0 ? "":" ") + field.getType().getSimpleName() + " " + field.getName() + ";\n");
        }
        s.append("}");
        System.out.println(s);
    }
}

