package com.huang.javase.Stringbuffer;

/*
* 使用方法无区别;
* stringbuffer和stringbuilder区别：
*   stringbuffer是多线程安全的。 有synchronized 关键字修饰
*   stringbuilder是非多线程安全的。 没有有synchronized 关键字修饰
* */
public class StringbuilderTest01 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("a");
        stringBuilder.append(true);
        stringBuilder.append(123);
        stringBuilder.append("b");
        stringBuilder.append(13491L);
        System.out.println(stringBuilder);
    }
}
