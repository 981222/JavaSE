package com.huang.javase.threadsafe;

public class AccountThread implements Runnable{
    Account act;

    public AccountThread() {
    }

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(5000);
        System.out.println("线程：" + Thread.currentThread().getName() + "对账户" + act.getActno() + "取款成功，余额" + act.getBalance());
    }
}
