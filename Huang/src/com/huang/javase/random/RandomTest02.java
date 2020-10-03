package com.huang.javase.random;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNum = new int[5];
        int index = 0;
        int num = 0;
        while (index < randomNum.length){
            boolean isNo = true;
            num = random.nextInt(5) + 1;
            for (int i = 0; i < randomNum.length; i++) {
                if (randomNum[i] == num){
                    isNo = false;
                }
            }
            if (isNo){
                randomNum[index] = num;
                System.out.println(randomNum[index++]);
            }
        }
    }
}
