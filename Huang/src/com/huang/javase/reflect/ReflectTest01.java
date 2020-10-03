package com.huang.javase.reflect;

import java.util.Date;

/*要操作一个类得字节码，得获取类的字节码，怎么获取？通过class：
 *    三种方式:
 *       1.Class c = Class.forName("java.lang.String");
 *       2.Class c = 对象.getClass();
 *       3.Class c = 任何类型.class;
 **/
public class ReflectTest01 {
    public static void main(String[] args) {
        //第一种
        //class.forname()静态方法，参数是字符串，字符串需要完整类名，加包名(lang包也不能省略。)。
        Class c2 = null;
        try {
            Class c1 = Class.forName("java.util.Iterator"); // c1代表Iterator.class文件
            c2 = Class.forName("java.lang.String");
            Class c3 = Class.forName("java.util.Date");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种
        //java中任何一个对象都有一个方法：getClass()
        String s = "123";
        Class x = s.getClass();
        //这个s获取的是他的类型的类String。
        System.out.println(c2 == x); // true

        //第三种
        //java中任何一个类型包括基本数据类型，它都有.class属性
        Class z = String.class;
        Class k = Date.class;
        Class f = int.class;
        Class l = boolean.class;


    }
}
