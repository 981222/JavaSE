package com.huang.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static void main(String[] args) {
        Log.log("你正在调用的是标准流输出的Log日志方法。");
        Log.log("这个方法很好用，我很喜欢。");
    }

    public static void log(String msg) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream("log",true));
            System.setOut(out);

            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String now = sdf.format(nowTime);
            System.out.println(now + " : " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
