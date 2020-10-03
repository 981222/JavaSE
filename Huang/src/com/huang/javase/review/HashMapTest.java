package com.huang.javase.review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*集合的创建
 * 集合添加元素
 * 集合取某个元素
 * 遍历集合
 * HashMap和TreeMao差不多。
 * */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"huang");
        map.put(2,"song");
        map.put(3,"ren");
        map.put(1,"zhangsan");

        System.out.println(map.size());

        System.out.println(map.get(1));

        //第一种方式：先获取所有keys，通过遍历keys调用get(key)传入key遍历。
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            System.out.println(key + "=" + map.get(key));
        }

        //第二种方式：将Map集合转换为Set集合，Set集合中每一个元素都是Node
        //这种Node节点中有key和value
        Set<Map.Entry<Integer, String>> nodes = map.entrySet();

        for (Map.Entry<Integer, String> node : nodes){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

    }
}
