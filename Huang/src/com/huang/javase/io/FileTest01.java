package com.huang.javase.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/*
File：
    1.File类和四大家族没有关系，所以File类不能完成文件的读和写操作。
    2.File对象代表什么？
        文件和目录路径名的抽象表达形式。
        C:\huang 这是一个File对象
        C:\huang\log.txt 这也是一个File对象
        一个File对象有可能是目录，也有可能是文件
        File只是一个路径名的抽象表达形式。
    3.File类中的常用方法：

*/
public class FileTest01 {

    public static void main(String[] args) throws IOException {
        // 创建一个file对象
        File f1 = new File("D:\\file");
        // 判断是否存在。
        System.out.println(f1.exists());
        //如果"D:\file"文件不存在，则以文件的形式创建出来
        /*if(!f1.exists()){
            //如果不存在，则创建文件。
            f1.createNewFile();
        }*/
        if(!f1.exists()){
            //以目录的方式创建。
            f1.mkdir();
        }


        File f2 = new File("D:\\a\\b\\c\\d\\e\\f");
        if (!f2.exists()){
            //创建多重目录。
            f2.mkdirs();
        }

        //获取父路径,绝对路径。
        File f3 = new File("D:\\后台系统\\java\\HelloWorld.java");
        String parentPath = f3.getParent();
        File parentFile = f3.getParentFile();
        System.out.println(parentPath);
        System.out.println(parentFile);
        System.out.println(f3.getAbsoluteFile());
        System.out.println(f3.getAbsolutePath());

        //获取文件名
        System.out.println(f3.getName());

        //判断是否是一个目录
        System.out.println(f3.isDirectory());

        //判断是否是一个文件
        System.out.println(f3.isFile());

        //获取文件最后修改时间。
        long haoMiao = f3.lastModified();
        Date tiem = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(tiem);
        System.out.println(strTime);

        //获取文件大小。
        System.out.println(f3.length());

        //获取当前目录下的所有子目录
        File f4 = new File("D:\\后台系统\\java");
        File[] files = f4.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
//            System.out.println(f.getAbsolutePath());
        }
        System.out.println(f3.getAbsolutePath());


    }
}
