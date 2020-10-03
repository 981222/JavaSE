package com.huang.javase.io;

import java.io.*;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
