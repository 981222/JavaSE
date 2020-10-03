package com.huang.javase.number;

import java.math.BigDecimal;

/*
    1. bigdecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
        这是sun公司专门给财务相关计算提供的类。
    2.面试时。相关财务计算的数据都用BigDecimal.
*/
public class BigDecimalTest01 {
    public static void main(String[] args) {
        BigDecimal v1 = new BigDecimal(100);
        BigDecimal v2 = new BigDecimal(200);

        //对象不能直接相加，用add方法相加
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);

    }
}
