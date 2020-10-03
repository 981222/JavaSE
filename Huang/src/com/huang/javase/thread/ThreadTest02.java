package com.huang.javase.thread;

/*java语言中实现线程有2中方式：
    1、编写一个类直接java.lang.Thread，重写run方法:
    2、编写一个类 实现 java.lang.Runnable 接口。

        推荐使用接口的方式，实现接口后还可以继承类，更灵活。继承只能继承一个类，有局限性。
 */
public class ThreadTest02 {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
        Thread t = new Thread(new MyRunnable());
        System.out.println(t.getName());
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程 ----> " + i);
        }
    }
}

//这并不是一个线程类。是一个可运行的类。还不是线程
class MyRunnable implements Runnable {

    @Override
    public void run() {
        // 编写程序。这段程序运行在分支栈中。
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程 ----> " + i);
        }
    }
}