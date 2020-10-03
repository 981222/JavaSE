package com.huang.javase.thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        //获取当前线程对象名字
        //在那个对象使用就获取哪个对象的名字
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        MyThread2 t = new MyThread2();
        System.out.println(t.getName());
        t.start();
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //获取当前线程对象名字
            //在那个对象使用就获取哪个对象的名字
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "--->" + i);
        }
    }
}
