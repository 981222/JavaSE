package com.huang.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

//实现线程的第三种方式：实现 Callable接口，这种方式实现的线程可以获取返回值。之前的线程 run的返回值是void 是无法获取返回值的。
public class ThreadTest10 {
    public static void main(String[] args) throws Exception {
        //第一步，未来任务类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {  // call 等于 run方法。只不过这又返回值
                System.out.println("call method begin");
                Thread.sleep(1000 * 5);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;
            }
        });

        Thread t = new Thread(task);

        t.start();
        System.out.println("执行完成");

    }
}
