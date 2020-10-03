package com.huang.javase.exception;

class MyStack {
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

    public void push(Object obj) throws MyStackOperationException {
        if(index > elements.length - 2){
            //创建异常对象，并抛出。
            //需要把他扔出去,使用throws.
            //使用try是没有意义的，自抛自捉没有意义。因为你是要把这个异常传递出去。
            throw new MyStackOperationException("压栈失败，栈已满！");
        }
        elements[++index] = obj;
        System.out.println("压栈成功" + obj + "元素成功，栈帧指向" + index);
    }

    public void pop() throws MyStackOperationException {
        if(index < 0){
            throw new MyStackOperationException("弹栈失败，栈以空！");
        }
        System.out.print("弹栈栈成功" + elements[index] + "元素成功,");
        elements[index--] = null;
        System.out.println("栈帧指向" + index);

    }

}
