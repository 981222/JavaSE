package com.huang.javase.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//事务的自动提交和手动提交
// conn.setAutoCommit(false);// 开启事务。
// conn.commit();// 没有异常，提交事务。
// conn.rollback();// 出现异常，回滚事务。
public class JDBCTest08 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/huang","root","981222");
            //将自动提交机制修改为手动提交
            conn.setAutoCommit(false);//开启事务。

            //DML语句insert添加 delete删除 update更新
            System.out.println(conn);
            //String sql = "insert into dept(dname,loc,deptno) values(?,?,?)";
            String sql = "update t_act set balance=? where actno=?";
            //String sql = "delete from dept where deptno=?";
            ps = conn.prepareStatement(sql);
            ps.setString(2,"111");
            //ps.setString(2,"songsong");
            ps.setInt(1,5000);
            int ints = ps.executeUpdate();


            ps.setString(2,"222");
            //ps.setString(2,"songsong");
            ps.setInt(1,5000);
            ints += ps.executeUpdate();

            System.out.println(ints);

            //程序能够走到这里说明程序没异常，事务结束，手动提交。
            conn.commit();// 没有异常，提交事务
        } catch (Exception e) {
            //出现异常时，回滚事务
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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
