package com.huang.javase.Array;

/*冒泡排序算法*/
public class BubbleSort {
    public static void main(String[] args) {
        //获取开始时间
        long startTime = System.nanoTime();

        int[] arr = {15,435,5467,234,57,123,123,46,56,3,5,8,2,354,2341,63451,52342133,4234,53412,34444};

        //使用冒泡排序算法进行排序
        //核心:拿左边的数据和右边的数据进行比较;将最大的数据换到右边。
        //外层循环
        for (int i = arr.length - 1; i > 0; i--) {
            //内层循环
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //获取结束时间
        long endTime = System.nanoTime();
        //输出程序运行时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
