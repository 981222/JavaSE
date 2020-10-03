package com.huang.javase.threadsafe2;

//银行账户
//使用线程同步机制，多线程对同一个账户进行取款，不会出现线程安全问题。
public class Account {
    //账户
    private String actno;
    //余额
    private double balance;

    Object obj = new Object();

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money){
    //public synchronized void withdraw(double money){
        //一下几行代码必须是线程排队的，不能并发。
        //一个线程执行完代码后，另一个线程才能进来执行代码。
        /*
        线程同步机制语法：
            synchronized (){
                //线程同步代码块
            }
            synchronized后面小括号中传的这个数据是相当关键的，
            这个数据必须时多线程共享的数据。才能达到多线程排队。

            ()中写什么。那要看你想让那些线程同步。
            假设 t1 t2 t3 t4 t5 5个线程
            你只希望 t1 t2 t3 排队。t4 t5 不需要铺对。怎么办？
            你一定要在() 中写一个t1 t2 t3 共享的对象。而这个对象对于t4 t5 不是共享的。


        这里的共享对象是账户对象。
        那么this就是账户对象。
        */
        //t1 执行到这里需要操作这个对象时。在执行过程中它就会锁起来。（类似洗手间，只能一个人用，你就去了就锁门，自己用完再到别人用。）
        //t2 执行到这里需要操作这个对象时。如果t1还没有执行完成，它就不会解锁。
        //当t1 执行完成之后。它就会解锁，让t2进去执行。
        //t3 ...
        //Object obj2 = new Object();
        //synchronized (只要共享对象就行){
        synchronized (this){  //行
        //synchronized (new Object()){  //不行 局部变量，线程都有不同的不共享的对象
        //synchronized (obj){  //行
        //synchronized (obj2){  //不行 局部变量，线程都有不同的不共享的对象，不是共享对象。
        //synchronized ("abc"){  //行 ”abc“ 在字符串常量池中。 所有线程都会同步。当很多线程使用这个方法时，都要排队。因为字符对象在字符串常量池中大家都共享同一个对象。
        //synchronized (null){  //不行
            double before = this.balance;
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }

    }
}
