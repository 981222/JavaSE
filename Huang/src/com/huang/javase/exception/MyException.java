package com.huang.javase.exception;

/*java中怎么自定义异常：
*    两步：
*        1.编写一个类继承Exception 或 RuntimeException
*        2.提供两个构造方法，一个无参，一个有String参数*/
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
