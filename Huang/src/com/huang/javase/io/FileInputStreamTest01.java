package com.huang.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*java.io.FileInputStream:
*     1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
*     2.字节的方式，完成输入的操作，完成读的操作（硬盘 --> 内存）
*     3.
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\huang\\test");

            //这个方法返回值是：读取到的“字节”本身
            //读取不到数据就返回 -1
            int readData = fis.read();
            System.out.println(readData);// 104
            readData = fis.read();
            System.out.println(readData);// 117
            readData = fis.read();
            System.out.println(readData);// 97
            readData = fis.read();
            System.out.println(readData);// 110
            readData = fis.read();
            System.out.println(readData);// 103
            readData = fis.read();
            System.out.println(readData);// -1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在finally语句块当中确保流一定会关闭。
            if (fis == null){//避免空指针异常
                //关闭的前提是流不是null空。流是null的时候就没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
