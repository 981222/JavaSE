package com.huang.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


//反编译类的方法。
public class ReflectTest08 {
    public static void main(String[] args) throws Exception {
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + " {\n");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods){
            s.append("\t");
            String modifier = Modifier.toString(method.getModifiers());
            s.append(modifier + (modifier.length() == 0 ? "":" ") + method.getReturnType() + " " + method.getName() + "(");
            Class[] pTypes = method.getParameterTypes();
            for (Class par : pTypes) {
                s.append(par.getSimpleName());
                s.append(",");
            }
            if (pTypes.length > 0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }
        s.append("}");
        System.out.println(s);
    }
}
