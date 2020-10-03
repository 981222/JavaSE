package com.huang.javase.exception;

public class ExceptionTest05 {
    public static void main(String[] args) {
        MyStack i = new MyStack();
        try {
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
            i.push(new Object());
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
            i.pop();
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
