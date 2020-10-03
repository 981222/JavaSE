package com.huang.javase.Stringbuffer;

/*
如果开发中需要使用频繁的拼接会有是吗问题
因为字符串不可变，不会自动回收，每次拼接都会创建对象，占用大量内存。造成内存浪费。
如果出现需要大量拼接字符串的时候建议使用：
    java.lang.Stringbuffer
    java.lang.Stringbuilder
如何优化Stringbuffer的性能呢？
    在创建的时候尽可能给一个初始化容量
    最好减少底层扩容的次数
*/

public class StringbufferTest01 {
    public static void main(String[] args) {
        //相对于String的 + 拼接 可以省去中间的内存
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("a");
        stringBuffer.append(true);
        stringBuffer.append(123);
        stringBuffer.append("b");
        stringBuffer.append(13491L);

        System.out.println(stringBuffer);

    }
}
