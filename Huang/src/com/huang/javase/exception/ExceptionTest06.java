package com.huang.javase.exception;

/*重写之后的方法不能比重写之前的方法抛出更多（更广泛）的异常，可以更少。
* 总结异常中的关键字：
*   异常捕捉：
*       try
*       catch
*       finally
*
*   throws 方法声明中使用，上报异常
*   throw 手动抛出异常
* */

public class ExceptionTest06 {
}

class Animal {
    public void doSome() throws Exception {

    }
}

class Cat extends Animal {
    public void doSome() throws Exception {

    }
}