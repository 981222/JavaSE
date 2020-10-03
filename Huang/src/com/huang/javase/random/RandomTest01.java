package com.huang.javase.random;

import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println(num);
    }
}
