package com.huang.javase.number;

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args) {
        // DecimalFormat 专门负责数字格式化的
        DecimalFormat df = new DecimalFormat("###,###.##");
        /*格式
        *   # 代表任意数字
        *   , 代表千分位
        *   . 代表小数点
        *   0 代表不够时补零
        * */
//        String s = df.format(123456);
        String s = df.format(112323456.134213);
        System.out.println(s);


        DecimalFormat df1 = new DecimalFormat("###,###.0000");
        String s1 = df1.format(112323456.13);
        System.out.println(s1);

    }
}
