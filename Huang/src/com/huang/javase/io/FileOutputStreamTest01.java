package com.huang.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 文件字节输出流，负责写。
* 从内存 --> 硬盘*/
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile文件不存在的时候会自动新建！
            //这种方式谨慎使用，这种方式会把源文件清空在重新写入。
            //fos = new FileOutputStream("myfile");

            //以追加的方式写入文件末尾,true，不会清空源文件内容
           fos = new FileOutputStream("myfile", true);

            //开始写
            byte[] bytes = {97,98,99,100,101,102,103};
            fos.write(bytes);//abcdefg
            fos.write(bytes,0,2);//ab

            //字符串
            String i = "我是中国人";
            //将字符串转换为byte数组。
            byte[] bs = i.getBytes();
            fos.write(bs);

            //写完后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
