package com.huang.javase.collection;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合中自定义对象元素可排序的第二种方式:
    使用比较器的方式。

Comparable 和 Comparator 怎么选择？
    当比较规则不会发生改变的时候，或者说比较规则只有一个的时候，建议实现Comparable接口。
    如果比较规则有多个，并且需要多个规则之间频繁切换，监视使用Comparator接口。
    Comparator的设计符合OCP原则。

* */
public class TreeSetTest03 {
    public static void main(String[] args) {
        //使用有参构造传入一个比较器，
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        //匿名内部类的方式
//        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
//            @Override
//            public int compare(WuGui o1, WuGui o2) {
//                return o1.age - o2.age;
//            }
//        });

        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(100));
        wuGuis.add(new WuGui(500));
        wuGuis.add(new WuGui(200));
        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}

class WuGui {
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟[" +
                "age=" + age +
                ']';
    }
}

//单独编写比较器；
class WuGuiComparator implements Comparator<WuGui> {
    @Override
    public int compare(WuGui o1, WuGui o2) {
        return o1.age - o2.age;
    }
}