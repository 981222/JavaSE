package com.huang.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream:标准的字节输出流。默认输出到控制台
*/
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        //联合起来写。
        System.out.println("Hello Wrold!");

        //分开写。
        PrintStream ps = System.out;
        ps.println("huang");
        ps.println("song");
        ps.println("ren");

        //标准输出流不需要关闭
        //可以改变标准输出流的输出方向嘛？可以
        //标准输出流不再指向控制台，指向‘log'文件。
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改标准输出流输出方向，将输出方向修改到‘log'文件。
        System.setOut(printStream);
        //在println,一下修改方向后的内容被输出到log文件内了。
        System.out.println("huang");
        System.out.println("spng");
        System.out.println("ren");
    }
}
