package com.huang.javase.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

//通过反射机制编译一个类的构造方法。
public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        StringBuilder s = new StringBuilder();
        Class c = Class.forName("com.huang.javase.reflect.Vip");
//        Class c = Class.forName("java.lang.StringBuilder");
        Constructor[] constructors = c.getConstructors();

        s.append("class " + c.getSimpleName() + " {\n");

        for (Constructor constructor : constructors){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(c.getSimpleName());
            s.append(" (");
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes){
                s.append(parameterType.getSimpleName());
                s.append(",");
            }
            if (parameterTypes.length > 0){
                s.deleteCharAt(s.length() - 1);
            }
            s.append(")");
            s.append("{}");
            s.append("\n");
        }
        s.append("}");
        System.out.println(s);
    }
}

class Vip{
    private int no;
    String name;
    String birth;
    boolean sex;

    public Vip() {
    }

    public Vip(int no) {
        this.no = no;
    }

    public Vip(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Vip(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public Vip(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
