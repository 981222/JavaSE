package com.huang.javase.JDBC;

import com.huang.javase.JDBC.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @description: 悲观锁和乐观锁。
 * @author: Andy
 * @time: 2020/7/29 15:39
 */
public class JDBCTest10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "select ename, job, sal from emp where job = ? for update";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"MANAGER");
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("ename") + "," + rs.getString("job") + "," + rs.getString("sal"));
            }
            // 再for update 悲观锁锁住的期间执行线程去修改被锁住的数据。
            // 发现修改不了。需要 提交了事务才能够解锁了才能修改。
            Thread t = new Thread(new setData());
            t.start();
            Thread.sleep(1000*5);

            conn.commit();
        } catch (SQLException throwables) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
    }


}

/**
 * 尝试修改悲观锁锁住了的数据
 */
class setData implements Runnable{

    setData(){}

    public void run(){
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            String sql = "update emp set sal = sal * 1.1 where job = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"MANAGER");
            int count = ps.executeUpdate();
            System.out.println(count);
            conn.commit();
        } catch (SQLException throwables) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }
    }
}
