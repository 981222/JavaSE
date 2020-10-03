package com.huang.javase.collection;

import java.util.*;

// java.util.Collection 集合接口
// java.util.Collections 集合工具类，方便集合的操作。
public class CollectionsTest {
    public static void main(String[] args) {
        //arraylist集合不是线程安全的。
        List<String> list = new ArrayList<>();

        //使用Collections 将 arraylist 变成线程安全的。
        Collections.synchronizedList(list);

        //排序
        list.add("asd");
        list.add("gdasf");
        list.add("gfc");
        list.add("dasfvc");
        Collections.sort(list);

        for (String i : list){
            System.out.println(i);
        }
        //对list集合中的元素排序。需要保证list集合中的元素实现了 Comparable接口。

        // Collections 只能对list集合进行排序，set集合需要转换为list集合
        Set<String> set = new HashSet<>();
        set.add("huang");
        set.add("hng");
        set.add("ren");
        set.add("resdn");
        set.add("rasfdn");
        //将set集合转换为list集合
        List<String> list1 = new ArrayList<>(set);
        Collections.sort(list1);
        for(String i : list1){
            System.out.println(i);
        }

        //这种方式也可以。
        //Collections.sort(list集合,比较器对象)；
    }
}
