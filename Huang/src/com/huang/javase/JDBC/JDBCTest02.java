package com.huang.javase.JDBC;

import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) {

        try {
            //1.注册驱动
            //第一种注册驱动的方式：
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //第二种注册驱动的方式：
            //通过看源码得知 com.mysql.jdbc.Driver() 这个类的静态代码块如下：
            //可以直接通过类加载来注册
            /*
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
            */
            //参数可以为字符串；放到配置文件中
            Class.forName("com.mysql.jdbc.Driver");

            //2.获取链接
            String url = "jdbc:mysql://127.0.0.1:3306/huang";
            String user = "root";
            String password = "981222";
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象 ---> " + conn);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
