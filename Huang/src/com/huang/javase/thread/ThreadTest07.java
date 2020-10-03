package com.huang.javase.thread;

/* 线程中断方法：
*     .stop() 直接扼杀线程，容易丢失数据。不建议使用。*/
public class ThreadTest07 {
    public static void main(String[] args) {
        //线程优先级。
        Thread.currentThread().setPriority(1);

        MyRunnable3 r = new MyRunnable3();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
    }
}

class MyRunnable3 implements Runnable {

    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}