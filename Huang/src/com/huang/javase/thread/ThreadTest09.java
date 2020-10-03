package com.huang.javase.thread;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
public class ThreadTest09 {
    public static void main(String[] args) throws ParseException {
        //创建对象。
        Timer timer = new Timer();
        //Timer timer = new Timer(true);//守护线程的方式。

        //指定定时任务。
        //timer.schedule(定时任务，第一次执行时间，间隔多久再执行一次)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date ftime = sdf.parse("2020-07-23 09:49:30");
        timer.schedule(new LogTimerTask(),ftime,1000 * 10);

    }
}

class LogTimerTask extends TimerTask {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stime = sdf.format(new Date());
        System.out.println(stime + ":完成了一次数据备份。");
    }
}