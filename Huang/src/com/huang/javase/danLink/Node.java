package com.huang.javase.danLink;

/*单链表中的节点
* 节点是单链表中的基本的单元。
* 每个节点Node都有两个属性：
*   一个属性存储数据，
*   另一个属性存储下一个节点的内存地址
* */
public class Node {
    //存储的数据
    Object element;

    //下一个节点的内存地址
    Node next;

    public Node(){

    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }


}

