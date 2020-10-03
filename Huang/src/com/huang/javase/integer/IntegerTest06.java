package com.huang.javase.integer;

public class IntegerTest06 {
    public static void main(String[] args) {
        //String,int,Integer之间的互换
        //String --> int
        String a = "123";
        int a1 = Integer.parseInt(a);
        System.out.println(a1 + 1); // 124

        //String --> Integer
        String b = "123";
        Integer b1 = Integer.valueOf(b);
        System.out.println(b1 + 1);

        //int --> String
        int c = 123;
        String c1 = c + "";
        System.out.println(c1 + 1); // 1231

        //int --> Integer
        //自动装箱
        Integer d = 1000;

        //Integer --> String
        String m = String.valueOf(b1);

        //Integer --> int
        //自动拆箱
        int x = d;
    }
}
