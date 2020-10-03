package com.huang.javase.collection;

import java.util.TreeSet;

//TreeSet中自定义对象的比较规则这么写？
//    先按年龄排序，年龄相同按名字排序
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("huang",10));
        vips.add(new Vip("song",20));
        vips.add(new Vip("ren",30));
        vips.add(new Vip("huang",20));
        for (Vip vip: vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*compareTo方法的返回值很重要
    * 返回0表示相同，value会覆盖
    * 返回>0，会继续在右子树上找
    * 返回<0，会继续在左子树上找    * */
    @Override
    public int compareTo(Vip v) {
        if(this.age == v.age){
            //年龄相同时，按照名字排序
            //姓名是String类型，String类型的compareTo()方法已经写好了。可以直接用。
            return this.name.compareTo(v.name);
        }else{
            //年龄不一样
            return this.age - v.age;
        }
    }
}