package com.huang.javase.Array;

//选择排序：
//    每一次从数据中找出最小元素,
//    将最小元素和最前面的元素交换,
//    选择排序比冒泡排序好在每次的交换都是有意义的。
public class SelectSort {
    public static void main(String[] args) {
        //获取开始时间
        long startTime = System.nanoTime();

        int[] arr = {15,435,5467,234,57,123,123,46,56,3,5,8,2,354,2341,63451,52342133,4234,53412,34444};

        //选择排序：
        //    每一次从数据中找出最小元素,
        //    将最小元素和最前面的元素交换,
        //    选择排序比冒泡排序好在每次的交换都是有意义的。
        for (int i = 0; i < arr.length - 1; i++) {
            // i 正好是这堆参与比较的数据中最左的下标。
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            //当min 和 i 相等时,不需要交换
            //当 min 和 i 不相等时,表示有比 i 更小的数据。需要交换。
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
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
