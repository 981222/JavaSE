/*
    1.接口也是一种"引用数据类型".编译之后也是一个class字节码文件
    2.接口是完全抽象。（抽象类是半抽象）或者也可以说接口是特殊的抽象类
    3.接口怎么定义，语法是什么？
        [修饰符列表] interface 接口名{}
    4.接口支持继承，且可以多继承
    5.接口中只包含两部分内容，一部分是：常量。一部分是：抽象方法（因为只有抽象方法，所以可以省略 public abstract）。其余没有。
    6.接口中所有元素都是public修饰。都是公开的。
    7.接口中的抽象方法不能带有方法体
    8.接口中的常量public static final可以省略。

    (*****) 一个类可以同时实现（继承）多个接口
    class song implements A, B{
        重写 抽象方法
    }
    */

public class huang {
    public static void main(String[] args) {


        jianpan j = new jianpan();
        xianshipin x = new xianshipin();
        shubiao s = new shubiao();

        diannao d = new diannao();

        d.inputD(j);
        d.inputD(x);
        d.inputD(s);

        d.outD(j);
        d.outD(x);
        d.outD(s);

    }
}


class song implements A, B{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

class getName implements Name{
    public void huang(){
        System.out.println("huang");
    }
    public void song(){
        System.out.println("song");
    }
    public void ren(){
        System.out.println("ren");
    }


}

interface Name{
    void huang();
    void song();
    void ren();
}

interface A{
    void m1();
}

interface B{
    void m2();
}

interface C extends A, B{

}

abstract class ShengLin{
    public abstract void name();
}

class People extends ShengLin{
    public void name() {
        System.out.println('1');
    }
}