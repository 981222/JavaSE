package com.huang.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*使用FileReader + FileWriter 只能拷贝”普通文本“文件。*/
public class Copy02 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("file");
            writer = new FileWriter("C:\\Users\\Administrator\\Desktop\\file");

            char[] chars = new char[1024];
            int readerCount = 0;
            while ((readerCount = reader.read(chars)) != -1){
                writer.write(chars,0,readerCount);
            }

            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
