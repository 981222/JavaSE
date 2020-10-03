package com.huang.javase.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream :数据专属的流。
这个流可以将数据连同数据的类型一并写入文件。
注意：这个文件不是普通文本文档。（这个文件使用记事本打不开。）
*/
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建专属数据流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));

        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 500.0F;
        double d = 600.6;
        boolean isb = true;
        char c = '1';

        //将数据及数据类型一并添加到文件中，记事本无法打开。
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(isb);
        dos.writeChar(c);

        dos.flush();
        dos.close();
    }
}
