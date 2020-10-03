package com.huang.javase.thread;

/* 线程的sleep()方法
*   static void sleep(long millis)
*       1.静态方法。
*       2.参数是毫秒。
*       作用：让当前线程进入休眠，进入阻塞状态，放弃占有CPU时间片，让给其他线程使用。*/
public class ThreadTest04 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
