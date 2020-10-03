package com.huang.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception {

        List<User> userList = new ArrayList<>();

        userList.add(new User("zhangsan",12));
        userList.add(new User("wangwu",122));
        userList.add(new User("lisi",22));
        userList.add(new User("zhaliu",52));
        userList.add(new User("zhliu",52));
        userList.add(new User("zhaoiu",52));
        userList.add(new User("zai",2));
        userList.add(new User("zhau",2));
        userList.add(new User("zhoiu",5));
        userList.add(new User("zoliu",52));
        userList.add(new User("holiu",52));
        userList.add(new User("aliu",52));
        userList.add(new User("zliu",52));
        userList.add(new User("zhaoliu",52));
        userList.add(new User("zhaoliu",52));
        userList.add(new User("zhaoliu",52));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        //序列化一个集合对象。
        oos.writeObject(userList);

        oos.flush();
        oos.close();
    }
}

class User implements Serializable {
    //transient 游离的。 不参与序列化。
    private transient String hehe;
    private String name;
    private int age;
    private int ase;


//    private static final long serialVersionUID = -6849794470754667710L;

    private int a;

    public User() {
    }

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
