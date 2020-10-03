package com.huang.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//反编译一个类。
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + " {\n");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields){
            s.append("\t");
            String modifier = Modifier.toString(field.getModifiers());
            s.append(modifier + (modifier.length() == 0 ? "":" ") + field.getType().getSimpleName() + " " + field.getName() + ";\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
