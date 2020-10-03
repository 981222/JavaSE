/*
psvm
sout
*/

import java.util.Objects;

public class HelloWorld {
    int s;
    int a;
    String b;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public HelloWorld() {
    }

    public static void main(String[] args) {
        System.out.println("Hello Wrold!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloWorld that = (HelloWorld) o;
        return s == that.s &&
                a == that.a &&
                Objects.equals(b, that.b);
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "s=" + s +
                ", a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}
