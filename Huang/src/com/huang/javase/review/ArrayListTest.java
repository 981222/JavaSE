package com.huang.javase.review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*集合的创建
 * 集合添加元素
 * 集合取某个元素
 * 遍历集合
 * */
public class ArrayListTest {
    public static void main(String[] args) {
        //arraylist集合
        //ArrayList<String> arrayList = new ArrayList<>();
        //linkedlist集合
        LinkedList<String> arrayList     = new LinkedList<>();

        arrayList.add("zhangsan");
        arrayList.add("lisi");
        arrayList.add("wangwu");

        System.out.println(arrayList.get(0));
        //普通for循环
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //迭代器
        Iterator<String> it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Iterator<String> it2 = arrayList.iterator(); it2.hasNext(); ){
            System.out.println(it2.next());
        }

        //forEach
        for (String item : arrayList){
            System.out.println(item);
        }
    }
}
