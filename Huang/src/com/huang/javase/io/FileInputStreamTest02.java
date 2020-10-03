package com.huang.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //IDEA默认的当前路径是工程文件下
            fis = new FileInputStream("test");
            /*int readData = 0;
            while ((readData = fis.read()) != -1){
                System.out.println(readData);
            }
            System.out.println("==============================================");*/
            //将byte[]数组传入read()方法，可以指定读取的数量。
            byte[] bytes = new byte[3];
            int readCount = fis.read(bytes);
            System.out.println(readCount);//第一次读取了3个。读取了多少给字节就返回多少
            System.out.println(new String(bytes));
            //不应该全部转换，应该是读了多少个返回多少个。
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);//第二次读取了2个。byte数组放满之后会从头开始替换
            System.out.println(new String(bytes));
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);//第三次读取不到数据返回-1。
            System.out.println(new String(bytes));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fis){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
