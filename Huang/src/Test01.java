public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();

        p = null;
        System.gc();
    }
}

class Person{

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("即将销毁对象！");
    }
}