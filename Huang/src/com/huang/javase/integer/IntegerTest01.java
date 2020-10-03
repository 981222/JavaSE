package com.huang.javase.integer;

public class IntegerTest01 {
    public static void main(String[] args) {
        // 当某个类只能传入一个引用类型的参数时，某次需要传入一个基本类型参数怎么办？
        // 可以传入一个参数对应的包装类

        //将需要传入的基本类型通过构造函数包装成对象传入即可
        //以下是自己写的。sun公司已经写好了8种包装类型。
        MyInt myInt = new MyInt(100);
        doSome(myInt);
    }

    public static void doSome(Object obj){
        System.out.println(obj);
    }
}

class MyInt{
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
