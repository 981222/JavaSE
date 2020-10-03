package com.huang.javase.String;

public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";

        //打印的是ture 还是false？ true
        //双等号比较的是变量中保存的内存地址。是的
        //因为 “123“ 已经被创建出来了。不会再次新建
        //字符串常量池不会被垃圾回收器回收。
        System.out.println(s1 == s2);

        //打印的是ture 还是false？ false
        //双等号比较的是变量中保存的内存地址。是的
        //因为2次new出来的string对象虽然指向的都是“123”的内存地址，但是他们本身的内存地址不一样。
        String s3 = new String("123");
        String s4 = new String("123");
        System.out.println(s3 == s4);

        //通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用“==”
        //“==”不保险。应该调用string对象自身的equals方法
        //string类已经重写了equals方法，我们调用的正是string重写的方法
        System.out.println(s3.equals(s4));

        String k = new String("huang");
        //String k = null;
        //"huang"后面为什么可以加.呢？
        //因为被双引号括起来的都是属于String对象。只要是对象都可以加点.
        System.out.println("huang".equals(k));// 建议使用这种方式。因为这样可以避免空指针异常。
        System.out.println(k.equals("huang"));// 如果k为null时，有空指针异常的风险。不建议这样写。
    }
}
