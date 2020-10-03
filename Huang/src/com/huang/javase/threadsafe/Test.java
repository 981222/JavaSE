package com.huang.javase.threadsafe;

public class Test {
    public static void main(String[] args) {
        Account act = new Account("01-981222",10000);
        Thread t1 = new Thread(new AccountThread(act));
        Thread t2 = new Thread(new AccountThread(act));
        t1.start();
        t2.start();
    }
}
