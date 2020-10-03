package com.huang.javase.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*IO + Properties 联合应用
* 非常好的一个理念：
*     以后经常改动的数据，可以单独的写到一个文件中，使用程序动态获取。
*     将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，
*     服务器不需要重启。就可以拿到动态的信息。
*
*     类似以上机制的文件称为配置文件，并且文件格式为：
*         key1=value
*         key2=value
*     的时候，我们把这种文件称为属性配置文件。
*
*     java规范中有要求，属性配置文件建议以properties结尾，但不是必须的。 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("copy.properties");
        Properties pro = new Properties();

        //调用 Properties对象的load方法将文件中的数据加载到map集合中
        pro.load(reader);// 文件中的数据顺着管道加载到Map集合中，其中等号=左边做key ，等号=右边做value

        //同过key获取value
        String username = pro.getProperty("zhangsan");
        System.out.println(username);
    }
}
