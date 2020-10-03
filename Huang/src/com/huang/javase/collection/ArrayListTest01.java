package com.huang.javase.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        //add(Object o )默认在集合末尾添加元素.
        //add(int index,Object o)指定位置添加元素.
        myList.add(1,"KING");

        Iterator it = myList.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //集合除了迭代器之外，还可以使用get()方法获取元素。
        //这是list特有的，set没有。
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(5 >> 2);
    }
}
