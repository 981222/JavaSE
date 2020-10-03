package com.huang.javase.ForEach;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr = {123,4512,4365,2314,35,456,45,6,23,32,43,546,6542,3,64,3};

        //普通for 有下标
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //增强for缺点：没有下标
        for (int i :
             arr) {
            System.out.println(i);
        }
    }
}
