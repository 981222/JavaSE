package com.huang.javase.collection;

/*HashMap集合
    1.HashMap集合底层是哈希表/散列表的数据结构.
    2.哈希表是一个怎样的数据结构：
        哈希表是一个数据和单项链表的结合体：
            数组中的每一个元素都是一个单向链表。
            注意：同一个单向链表上所有节点的hash相同，因为他们的数组下标是一样的。
            但同一个链表上k和k的equals()方法肯定返回false，都不相等。
            这就是哈希表。
        数组：查询效率高，随机增删效率低。
        链表：查询效率低，随机增删效率高。
        哈希表将以上2种数据结构融合在一起，充分发挥他们各自的优点（查询，增删都很不错。但没到极致。）。
    3.HashMap集合底层代码：
    public class HashMap {

        //HashMap底层实际上就是一个数组（一维数组）
        Node<K, V>[] table;

        //静态内部类HashMap.Node
        static class Node<K, V> {
            final int hash; // 哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希函数/算法，可以转换存储成数组的下标。）
            final K key; // 存储到Map集合中的key
            V value; // 存储到Map集合中的value
            Node<K,V> next; // 下一个节点的地址。
        }
    }
    哈希表/散列表: 一维数组，这个数组中每一个元素都是一个单向链表。（数组和链表的结合体。）
    4. 主要掌握：
        map.put<k,v>
        v = map.get(k)
        以上map集合中的存，取操作原理，必须要掌握。
    5.原理：
        map.put<k,v>实现原理：
            第一步：先将k，v封装到Node对象当中。
            第二步：底层会调用key的hashCode()方法得到hash值，
            然后通过哈希函数/哈希算法，将hash值转换成数组下标，
            下标位置上如果没有任何元素，就把Node加到这个位置上。
            如果说下标对应的位置上有数据（链表），此时会拿着k和
            链表上的每一个节点中的k进行equals()，如果所有的equals()
            方法返回都是false，那么这个新节点将被添加到链表的末尾。
            如果其中有一个equals()返回了true，那么这个节点的value将会被覆盖。

        v = map.get(k)实现原理：
                先调用k的hashCode()方法得出哈希值，通过哈希算法
            转换成数组下标，通过数组下标快速定位到某个位置上，如果这个
            位置上什么都没有，返回null。如果这个位置上有单向链表那么会
            拿着参数k和单向链表上的每一个节点中的k进行equals()，如果
            所有equals()方法返回false，那么get()方法返回null，只要
            其中有一个节点的k和参数k equals()的时候返回true，那么这个
            节点中的value就是我们要找的value，get()方法最终返回这个要找的value。
    重点:HashMap集合的key，会先后调用两个方法，hashCode(),equals(),那么这两个方法都要重写。
    6.哈希表HashMap使用不当时，无法发挥他的性能!
        假设将所有的hashCode()方法返回一个固定值，那么会导致底层哈希表变成纯单向链表。
        假设将所有的hashCode()方法返回都设定为一个不一样的值，那么会导致底层哈希表变成纯一维数组。
        这种情况我们称为：散列分布不均匀。
        什么是散列分布均匀呢？
            假设有100个元素，10个单向链表，那么每个单项链表上有10个节点，这是最好的。
        散列分布均匀需要你重写hashCode的时候有一定的技巧才行。

*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        //Integer 是 k， 他的hashCode()和equals()方法都重写了。
        //String 是 v， 他的hashCode()和equals()方法都重写了。
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"h");
        map.put(1,"huang");//k重复时value会被覆盖。
        map.put(2,"song");
        map.put(3,"ren");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer, String> i:set){
            System.out.println(i.getKey() + "=" + i.getValue());
        }
        System.out.println(map.get(1));

        Student s1 = new Student("huang");
        Student s2 = new Student("song");

        System.out.println("s1的hashCode=" + s1.hashCode());
        System.out.println("s2的hashCode=" + s2.hashCode());



    }
}
