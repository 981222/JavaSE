package com.huang.javase.thread;


//怎么中断线程睡眠。
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 中断t线程的睡眠（这种中断睡眠的方式依靠了java的异常处理机制。）
        t.interrupt();// 干扰 一盆冷水过去。

    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "===> begin");
        try {
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //1年后执行到这里。
        System.out.println(Thread.currentThread().getName() + "===> end");
    }
}