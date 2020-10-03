package com.huang.javase.danLink;

/*
链表优点：由于链表上的元素在内存空间中不连续,随机增删元素效率高（因为增删元素不涉及到大量元素位移）
链表缺点：内存地址不连续《不能通过数学表达式计算内存地址,查询效率低，每一次查询某个元素都需要从头到尾往下遍历查询。
链表和数组恰恰相反。
数组的优点就是链表的缺点。
数组的缺点就是链表的优点。
<E> 泛型
可以规定某个方法传入的参数类型
Link<String> link = new Link<>;
link.add("huang");

Link<int> link = new Link<>;
link.add(123);

*/
public class Link<E> {
    //头节点
    Node header;

    int size;

    //向链表添加元素
    public void add(E data){
        if(header == null){
            //说明还没有节点
            //new一个新对象作为头节点
            //这个时候的节点既是头节点也是末尾节点
            header = new Node(data,null);
        }else{
            //说明头节点已经有了
            //这时要找出末尾节点，让当前末尾节点的next是新节点的内存地址。
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
        size++;
    }

    /*寻找末尾节点*/
    private Node findLast(Node node) {
        //如果一个节点的next等于null，他就是末尾节点
        if (node.next == null){
            return node;
        }
        //程序能到这里，说明这个node不是节点
        //递归，把node.next传下去继续寻找
        return findLast(node.next);
    }

    //删除元素
    public void remove(Object obj){

    }

    //修改元素
    public void modify(Object obj){

    }

    //寻找元素
    public int find(Object obj){
        return 0;
    }
}

