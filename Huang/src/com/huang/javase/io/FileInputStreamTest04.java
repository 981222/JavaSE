package com.huang.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*FileInputStream的常用方法：
      int available();返回剩余的字节数量。
      long skip(long n); 跳过几个字节不读取
* */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test");
            System.out.println("总字节数量：" + fis.available());
            //int readByte = fis.read();
            //System.out.println("总字节数量：" + fis.available());

            //一个byte数组读完文件。
            // 这种方式不适合大文件。因为byte数组不能太大。
            //byte[] bytes = new byte[fis.available()];
            //int readCount = fis.read(bytes);
            //System.out.println(new String(bytes));

//            无效方法
//            byte[] bytes = new byte[3];
//            for(byte b : bytes){
//                System.out.println(b);
//            }

            // skip(); 跳过几个字节不读取
            fis.skip(2);
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
