package com.huang.javase.reflect;

public class AboutPath {
    public static void main(String[] args) {
        //缺点:移植性差。
        //FileReader reader = new FileReader("Huang/classinfo.properties");

        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.properties").getPath();//通用性强。将文件同一放在src路径下。
        System.out.println(path);
    }
}
