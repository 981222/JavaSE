package com.huang.javase.thread;

/*java语言中实现线程有2中方式：
    1、编写一个类直接java.lang.Thread，重写run方法:
    2、编写一个类 实现 java.lang.Runnable 接口。
*           怎么创建线程对象。
*           怎么启动线程。
*       */
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread myThread = new MyThread();

        myThread.run(); // 直接使用run方法 不会启动新线程。不会分配新的栈分支。不能并发。还是根普通方法一样。
        //启动线程
        // start的作用。在JVM中开辟一个新的栈空间，当代码完成后瞬间结束。
        // 这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开辟出来，start方法就结束了。线程就启动成功了。
        // 启动成功的线程会自动调用run方法。
        // run 方法在分支栈的底部，main 方法在主栈的底部。run 和 main 是平级的。
        myThread.start();// 瞬间结束，开辟栈空间。
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程 ----> " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        // 编写程序。这段程序运行在分支栈中。
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程 ----> " + i);
        }
    }
}
