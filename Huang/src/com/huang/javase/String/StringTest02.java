package com.huang.javase.String;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "Hello World!";

        // char同理
        // byte数组
        byte[] bytes = {97,98,99};
        //传入byte数组将其转换为字符串
        String s2 = new String(bytes);
        System.out.println(s2);
        //String(字节数组,下标起始位置,长度)
        System.out.println(new String(bytes, 1, 2));

        //String常用方法
        //获取字符串的某个索引的char值
        char c = "中国人".charAt(1);
        //字符串转char数组
        char[] c1 = "中国人".toCharArray();
        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i]);
        }
        System.out.println(c);

        System.out.println("abc".compareTo("abc"));// 字符串.compareTo(字符串) 比较两个字符串大小
        System.out.println("abc".compareTo("abe"));// 比较第一个，相等则继续比较
        System.out.println("==================");
        System.out.println("黄松仁".compareTo("曾林芳"));

        // 字符串.contains(字符串) 判断前面的字符串是否包含后面的字符串
        System.out.println("Hello world!".contains("llo"));
        System.out.println("Hello world!".contains("lls"));

        // 判断当前字符串是否以某个字符串结尾
        // 判断当前字符串是否以某个字符串开始
        // startWith()
        System.out.println("test.txt".endsWith("txt"));
        System.out.println("test.txt".endsWith("exe"));

        //判断两个字符串是否相等，忽略大小写。
        System.out.println("ABc".equalsIgnoreCase("abc"));//ture

        //将字符串转换为byte数组；
        byte[] bytes1 = "ren".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }

        //判断某个字符串在当前字符串首次出现的索引
        // 最后一次出现 ： lastindexOf
        System.out.println("huangsongren".indexOf("so"));

        //判断字符串长度
        System.out.println("abc".length());

        //replace 替换
        //字符串.replace("需要被替换的字符串","要替换成的字符串")
        //返回字符串

        // split 拆分
        //字符串.split("分隔符")
        //返回String数组

        //截取字符串
        System.out.println("huangsongren".substring(3));
        System.out.println("huangsongren".substring(3,8));

        //转换大小写
        //小写 ： 字符串.toLowerCase()
        //大写 ： 字符串.toUpperCase()

        // 去除字符串前后空白
        // 字符串.trim()

        //String 中唯一的一个静态方法
        // 将非字符串转换为字符串
        // String.valueOf(非字符串类型)
        // 如果传入对象类型，则调用对象的toString()
        // 本质上，println在源代码中就是调用valueOf()方法
        System.out.println(String.valueOf(true));
    }
}
