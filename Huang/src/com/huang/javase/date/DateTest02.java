package com.huang.javase.date;

/*system类
* */

public class DateTest02 {
    public static void main(String[] args) {
        //获取1970年1月1日00:00:00 000 到 当前系统时间的总毫秒数
        //1 秒 == 1000毫秒
        long now = System.currentTimeMillis();
        System.out.println(now);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长" + (end - begin) + "毫秒");
    }

    public static void print(){
        for (int i = 0; i < 1000000; i++) {
            System.out.println("i == " + i);
        }
    }
}
