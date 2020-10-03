package com.huang.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date();
        System.out.println(nowTime);

        //日期类型格式化，在java.text包下
        /*
        * yyyy 年
        * MM 月
        * dd 日
        * HH 时
        * mm 分
        * ss 秒
        * SSS 毫秒 1000毫秒 == 1秒
        * 定义格式类型：
        *     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(nowTime));

        //字符串转date
        String time = "2008-08-08 08:08:08 888";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime);
        System.out.println(sdf2.format(dateTime));

    }
}
