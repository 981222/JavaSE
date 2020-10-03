package com.huang.javase.Array;

public class Array02 {
    public static void main(String[] args) {
        Object[] o = {"huang","song","ren","java","python","fang"};
        MyStack a = new MyStack();
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());
        a.push(new Object());

        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        a.pop();
        System.out.println(a.getElements());
    }
}
class MyStack{
    private Object[] elements;

    private int index = -1;

    public MyStack() {
        index = -1;
        elements = new Object[10];
    }

    public Object[] getElements() {
//        for (int i = 0; i < this.elements.length; i++) {
//            System.out.println(this.elements[i]);
//        }
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object obj){
        if(index > elements.length - 2){
            System.out.println("压栈失败，栈已满。");
            return;
        }
        elements[++index] = obj;
        System.out.println("压栈成功" + obj + "元素成功，栈帧指向" + index);
    }

    public void pop(){
        if(index < 0){
            System.out.println("弹栈失败，栈为空。");
            return;
        }
        System.out.print("弹栈栈成功" + elements[index] + "元素成功,");
        elements[index--] = null;
        System.out.println("栈帧指向" + index);

    }

}
