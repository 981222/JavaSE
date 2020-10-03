package com.huang.javase.review;

import java.util.HashSet;
import java.util.Iterator;

/*集合的创建
* 集合添加元素
* 集合取某个元素
* 遍历集合
* HashSet集合特点：无序不可重复
* HashSet是HashMap的key，存储在HashMap集合key中的对象元素需要同时重写 equals()，hashCode()。
* */

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("zhaoliu");

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String i:
             hashSet) {
            System.out.println(i);
        }
    }
}
