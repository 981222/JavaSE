package com.huang.javase.io;

import java.io.*;

/*ObjectOutputStream : 将对象序列化保存。
*     参与序列化的对象需要实现 Serializable 接口。
*     注意：通过源码发现 Serializable 只是一个标志接口：
*     public interface Serializable {
*     }
*     里面什么代码都没有。
*     那么它起到一个什么样的作用?
*         起到标识的作用，java虚拟机看到这个类实现了 Serializable 接口。可能会对这个类进行特殊待遇。
*         这个标识接口是给java虚拟机看得。java虚拟机看到之后会自动生成一个序列化版本号。
*/
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Student student = new Student("zhagnsan",12);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        oos.writeObject(student);

        oos.flush();
        oos.close();
    }
}

class Student implements Serializable {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
