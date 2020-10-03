package com.huang.javase.thread;

//守护线程
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("t");
        //设置为守护线程。main方法结束自动结束。
        t.setDaemon(true);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread {
    int i = 0;

    @Override
    public void run() {
        while (true){

            System.out.println(Thread.currentThread().getName() + "---->" + ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
