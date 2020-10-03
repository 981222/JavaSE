package com.huang.javase.Enum;

public class EnumTest01 {
    public static void main(String[] args) {
        //
    }

    /**
     * 一下程序，计算两个int类型数据的商，成功return 1， 失败return 0
     * @param a int类型数据
     * @param b int类型数据
     * @return 返回1成功，0失败
     */
    public static int divide(int a, int b){
        try{
            int c = a / b;
            return 1;
        }catch (Exception e){
            return 0;
        }

    }
}
