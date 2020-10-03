package com.huang.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
BufferedReader:
    带有缓冲区的字符输入流。
    不需要自定义char数组或者byte数组。自带缓冲。

*/
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("test");
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流被叫做：节点流。
        //外部负责包装的这个流叫做：包装流 或 处理流。
        //当前程序：FileReader 就是节点流 BufferedReader就是包装流/处理流
        BufferedReader br = new BufferedReader(reader);

        /*String firstLine = br.readLine();
        System.out.println(firstLine);*/

        //br.readLine()方法读取一个文本行，但不带换行符。
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        //对于这种流来说，只需要关闭外部的包装流/处理流即可，节点流回自动关闭。
        br.close();
    }
}
