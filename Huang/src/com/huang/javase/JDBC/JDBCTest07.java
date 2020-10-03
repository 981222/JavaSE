package com.huang.javase.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest07 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/huang","root","981222");
            //DML语句insert添加 delete删除 update更新
            System.out.println(conn);
            //String sql = "insert into dept(dname,loc,deptno) values(?,?,?)";
            //String sql = "update dept set dname=?, loc=? where deptno=?";
            String sql = "delete from dept where deptno=?";
            ps = conn.prepareStatement(sql);
            //ps.setString(1,"song");
            //ps.setString(2,"songsong");
            ps.setInt(1,80);

            int ints = ps.executeUpdate();
            System.out.println(ints);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
    }
}
