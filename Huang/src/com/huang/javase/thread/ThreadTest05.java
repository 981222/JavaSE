package com.huang.javase.thread;


//Thread.sleep()面试题
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            //问题： 这行代码会让线程t进入休眠嘛？
            //恰恰相反，当前线程休眠了。
            //因为sleep是静态方法。 在执行时还是会转换成 Thread.sleep();
            t.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hw");

    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " --> " + i);
        }
    }
}