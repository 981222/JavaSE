package com.huang.javase.exception;

//自定义的栈操作异常。
public class MyStackOperationException extends Exception {
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}
