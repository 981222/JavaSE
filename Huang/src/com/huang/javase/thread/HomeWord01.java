package com.huang.javase.thread;

import java.util.ArrayList;
import java.util.List;

public class HomeWord01 {
    int num = 1;

    public static void main(String[] args) {
        HomeWord01 homeWord01 = new HomeWord01();

        Thread t1 = new Thread(new ProducerNum(homeWord01));
        Thread t2 = new Thread(new ConsumerNum(homeWord01));

        t1.setName("奇数");
        t2.setName("偶数");

        t1.start();
        t2.start();

    }
}

//生产线程
class ProducerNum implements Runnable {
    private HomeWord01 num;

    public ProducerNum(HomeWord01 num) {
        this.num = num;
    }

    @Override
    public void run() {
        //一直生产
        while (true){
            synchronized (num){
                if (num.num % 2 == 0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "--->" + num.num++);
                num.notify();
            }
        }
    }
}

//消费线程
class ConsumerNum implements Runnable {
    private HomeWord01 num;

    public ConsumerNum(HomeWord01 num) {
        this.num = num;
    }

    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (num){
                if (num.num % 2 == 1){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "--->" + num.num++);
                num.notify();
            }
        }
    }
}
