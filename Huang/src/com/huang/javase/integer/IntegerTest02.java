package com.huang.javase.integer;

/*
* 8种基本数据类型对应的包装类型是什么：
    * 基本包装类型                   包装类型                           父类
    * --------------------------------------------------------------------------
    * byte                          java.lang.Byte                  Number
    * short                         java.lang.Short                 Number
    * int                           java.lang.Integer               Number
    * long                          java.lang.Long                  Number
    * float                         java.lang.Float                 Number
    * double                        java.lang.Double                Number
    * boolean                       java.lang.Boolean               Object
    * char                          java.lang.Character             Object
    *
    * Number 是一个抽象类，无法实例化对象。
    * Number类中，有这样的一些方法（拆箱）：
    *       基本数据类型 + Value()
    *       intValue()
    *
    * 以上包装类中，Integer重点代表学习
* */
public class IntegerTest02 {
    public static void main(String[] args) {
        //123这个基本数据类型经过构造方法转换成引用数据类型
        //基本数据类型 ---(转换)---> 引用数据类型   (装箱)
        Integer i = new Integer(98);
        System.out.println(i);

        //引用数据类型 ---(转换)---> 基本数据类型   (拆箱)
        System.out.println(i.byteValue());
    }
}
