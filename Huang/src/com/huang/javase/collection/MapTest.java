package com.huang.javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//map中的遍历
public class MapTest {
    public static void main(String[] args) {
        //第一种方式：获取所有的key
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"huang");
        map.put(2,"song");
        map.put(3,"ren");

        Set<Integer> keys = map.keySet();
        //迭代器方式
        /*Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }*/
        //foreach方式
        for (Integer i:
             keys) {
            System.out.println(map.get(i));
        }

        //第二种 Set<Map.Entry<K, V>> entrySet()
        //第二种方式效率高，这种方式适合大数据量
        //以上这个方法，是吧mao集合全部转化为set集合
        Set<Map.Entry<Integer,String>> m = map.entrySet();
        //迭代器方式：
        Iterator<Map.Entry<Integer, String>> it2 = m.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
        //forEach方式:
        for (Map.Entry<Integer, String> i : m){
            System.out.println(i.getKey() + "=" + i.getValue());
        }

    }
}

