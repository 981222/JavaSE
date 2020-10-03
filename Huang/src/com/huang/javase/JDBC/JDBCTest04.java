package com.huang.javase.JDBC;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest04 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");

        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1.注册驱动
            Class.forName(driver);

            //2.获取链接
            conn = DriverManager.getConnection(url,user,password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();

            //4.执行SQL
            String sql = "select empno as no, ename, job, sal from emp";
            // int executeUpdate(insert/delete/update) 专门执行DML语句的(insert delete update)
            // ResultSet executeQuery(select) 专门执行DQL语句的方法(select)
            rs = stmt.executeQuery(sql);

            //5.处理结果集
            while (rs.next()){
                //不管数据库中的数据是什么类型，都是String方式取出。
                //JDBC中所有的下标都是从1开始。不是从0开始。
                //String empno = rs.getString(1);
                //String ename = rs.getString(2);
                //String job = rs.getString(3);
                //String sal = rs.getString(4);

                //也可以使用sql中查询的列名来获取。
                //列的名称不是表中的列。是查询结果集中的列
                String empno = rs.getString("no");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");

                System.out.println("| " + empno + " | " + ename + " | " + job + " | " + (sal + 200) + " | ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //先释放查询结果集
            //后数据库操作对象
            //后数据库链接
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
