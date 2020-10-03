package com.huang.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/*
BufferedWriter：带有缓冲的字符输出流。
OutputStreamWriter: 转换流，将字节流转换为字符流。
* */
public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception{
        //带有缓冲的字符输出流。
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));
        //节点流和包装流是相对的

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy", true)));
        out.write("Hello Wrold!\n");
        out.write("hello kitty!");
        out.flush();
        out.close();
    }
}
