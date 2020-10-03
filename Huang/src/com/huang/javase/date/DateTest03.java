package com.huang.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        Date nowTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        sdf.format(nowTime);
        System.out.println(sdf.format(nowTime));

        //获取昨天现在的时间；
        Date yesDay = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);
        System.out.println(sdf.format(yesDay));
    }
}
