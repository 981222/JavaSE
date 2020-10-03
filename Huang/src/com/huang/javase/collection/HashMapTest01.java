package com.huang.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//map种的常用方法
public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"huang");
        map.put(2,"song");
        map.put(3,"ren");
        //根据key获取value
        System.out.println(map.get(1));
        //获取键值对的数量
        System.out.println(map.size());
        //获取所有的value
        Collection<String> values = map.values();
        for (String s:
                values) {
            System.out.println(s);
        }
        //通过key删除value
        System.out.println(map.remove(2));//返回value
        System.out.println(map.size());
        //判断是否包含某个key
        //contains 方法底层调用equals()方法进行对比，所以自定义的类型需要重写equals()方法。
        System.out.println(map.containsKey(1));//true
        //判断是否包含某个value
        System.out.println(map.containsValue("huang"));//true
        //清空集合
        map.clear();
        System.out.println(map.size());
        //判断是否为空
        System.out.println(map.isEmpty());
    }
}
