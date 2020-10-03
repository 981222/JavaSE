package com.huang.javase.review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*集合的创建
 * 集合添加元素
 * 集合取某个元素
 * 遍历集合
 * TreeSet集合特点：可排序的
 * 存储在TreeSet集合key中的对象元素需要实现Comparable()接口或者传入Comparator()比较器。
 * */
public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet<Integer> treeSet = new TreeSet<>();
        //传入比较器可以改变比较方式。
        //先走比较器在走实现的比较接口。
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeSet.add(1);
        treeSet.add(123);
        treeSet.add(23);
        treeSet.add(54);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(50);
        treeSet.add(50);

        Iterator it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Integer i:
                treeSet) {
            System.out.println(i);
        }
    }
}
