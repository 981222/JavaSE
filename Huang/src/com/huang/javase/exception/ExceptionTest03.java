package com.huang.javase.exception;

//final finally finalize 又什么区别?
public class ExceptionTest03 {
    public static void main(String[] args) {
        //final 表示最终的，不变的；
        final int i = 100;

        //finally 和try联合使用，在异常处理机制中，finally 一定会执行。
        try {

        } finally {
            System.out.println("100");
        }

        //finalize()是Object类中的一个方法，作为方法名出现。
        //所以finalize是标识符

    }
}
