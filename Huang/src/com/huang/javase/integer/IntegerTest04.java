package com.huang.javase.integer;

public class IntegerTest04 {
    public static void main(String[] args) {
        //jdk1.5之后。不需要在new对象，可以直接赋值int类型自动装箱。
        //自动装箱。拆箱
        Integer x = 100;
        int y = x;

        //有了自动装箱拆箱，Number类中的方法就用不着了

        Integer num = new Integer(100);
        System.out.println(num + 1);
        System.out.println(num);
        //相等 == 不会启动自动拆箱。
        System.out.println(num == x);
        //为什么这里没有对象 + int 没有报错。
        //因为java会自动拆箱。将 x 对象 拆出来相加
        System.out.println(x + 1);


        //重点面试题
        //Integer类 加载的时候会初始化整数类型常量池(缓存) : 256个对象。
        //为什么?
        //java中为了提高程序的执行效率，将-128~127之间的所有包装对象提前创建好了
        //放到了一个方法区的”整数类型常量池“当中，目的是只要用这个区间的数据就不需要在new对象。可以直接取出。
        //原理：a1 和 b1 保存的内存地址是一样的，所以为true
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false
        Integer a1 = 127;
        Integer b1 = 127;
        System.out.println(a1 == b1);// true
    }
}
