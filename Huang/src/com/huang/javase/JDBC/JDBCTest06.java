package com.huang.javase.JDBC;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;


/*
1.解决sql注入问题：
    只要用户提供的信息不参与sql语句编译的过程。
    即使有sql语句关键字，但不参与编译就没问题。
    要想用户提供的信息不参与编译，需要使用java.sql.preparedStatement
    java.sql.preparedStatement接口继承了java.sql.Statement
    java.sql.preparedStatement是属于预编译的数据库操作对象。
    java.sql.preparedStatement的原理是：预先对SQL语句的框架进行编译，然后再给SQL语句传"值"。
*/
public class JDBCTest06 {

    public static void main(String[] args) {
        Map<String, String> userLoginInfo = initUI();
        boolean loginSuccess = login(userLoginInfo);
        System.out.println(loginSuccess ? "登陆成功":"登陆失败");
    }

    private static boolean login(Map<String, String> userLoginInfo) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");

        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        PreparedStatement ps = null;  //这里使用的是java.sql.preparedStatement（预编译的数据库操作对象）
        ResultSet rs = null;

        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");


        boolean loginSuccess = false;

        try {
            //注册驱动
            Class.forName(driver);
            //获取链接
            conn = DriverManager.getConnection(url,user,password);
            //获取预编译的数据库操作对象
            //SQL语句的框子。其中一个?号等于一个占位符，只能接受”值“
            String sql = "select * from t_user where loginName = ? and loginPwd = ?";
            ps = conn.prepareStatement(sql);
            //给占位符传值。（第一个问号的下标是1，第二个问号的下标是2 ， jdbc中所有下标从1开始。）
            ps.setString(1,userLoginInfo.get("loginName"));
            ps.setString(2,userLoginInfo.get("loginPwd"));

            rs = ps.executeQuery();
            if(rs.next()){
                loginSuccess = true;
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
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
        return loginSuccess;
    }

    private static Map<String, String> initUI() {
        Scanner s = new Scanner(System.in);

        System.out.println("用户名：");
        String loginName = s.nextLine();

        System.out.println("密码：");
        String loginPwd = s.nextLine();

        Map<String,String> userLoginInfo = new HashMap<>();

        userLoginInfo.put("loginName",loginName);
        userLoginInfo.put("loginPwd",loginPwd);

        return userLoginInfo;
    }
}
