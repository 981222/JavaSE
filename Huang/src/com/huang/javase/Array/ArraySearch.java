package com.huang.javase.Array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {15,435,5467,234,57,123,123,46,56,3,5,8,2,354,2341,63451,52342133,4234,53412,34444};

        //第一个方法：
        //普通的查找方法，一个一个的找。
        int index = arraySearch(arr,57);
        System.out.println(arraySearch(arr,57) == -1 ? "该元素不存在" : "元素下标:" + arraySearch(arr,57));

        //第二个方法：
        //二分法折半查找,直到找到中间折半的数据相同。
        // a = {1(下标0),2,3,4,5,6,7,8,9,10,11(下表10)}
        // 查找 9
        // (0 + 10) / 2 = 5
        // a[5] = 6 > 9
        // 继续 (5 + 1 + 10) / 2 = 8
        // a[8] = 9 == 9
        //二分法查找算法是基于排序的基础上的（没有排序的数据是无法查找的。）
    }


    private static int arraySearch(int[] arr, int ele) {
        for (int j = 0; j < arr.length; j++) {
            if(ele == arr[j]){
                return j;
            }
        }
        return -1;
    }


}
