package com.huang.javase.collection;

import java.beans.Customizer;
import java.util.TreeSet;

/*
1.TreeSet集合底层实际上是一个TreeMap
2.TreeSet集合底层就是一个二叉树
3.放到TreeSet集合中的元素，等同于放到TreeMap集合key部分了
4.TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小自动排序。
称为：可排序集合。

对于自定义对象的排序：
    如果自定义对象不实现Comparable<Customer>,存储数据时将报错。

* */
public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("huang");
        treeSet.add("song");
        treeSet.add("ren");
        treeSet.add("zhangsan");
        treeSet.add("lisi");

        for (String i : treeSet){
            System.out.println(i);
        }

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(100);
        treeSet1.add(123);
        treeSet1.add(23);
        treeSet1.add(12);
        treeSet1.add(113);

        for (Integer i : treeSet1){
            System.out.println(i);
        }

        Test t1 = new Test(1);
        Test t2 = new Test(2);
        Test t3 = new Test(4);
        Test t4 = new Test(3);

        TreeSet<Test> treeSet2 = new TreeSet<>();
        treeSet2.add(t1);
        treeSet2.add(t4);
        treeSet2.add(t3);
        treeSet2.add(t2);
        for (Test i : treeSet2){
            System.out.println(i);
        }
    }
}

// 放在TreeSet集合中的元素需要实现java.lang.Comparable接口。
// 并实现compareTo()方法，equals()方法可以不写了
class Test implements Comparable<Test>{
    private int age;

    public Test(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Test t) { // t.compareTo(t1)
        //this 是 t
        //t 是 t1
        //t 和 t1进行比较就是 this 和 t 进行比较。
        return this.age - t.age;// =0 >0 <0
    }

    @Override
    public String toString() {
        return "Test" + "[age=" + this.age + "]";
    }
}