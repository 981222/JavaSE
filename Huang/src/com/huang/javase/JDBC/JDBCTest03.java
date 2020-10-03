package com.huang.javase.JDBC;

import java.sql.*;
import java.util.ResourceBundle;

//将链接数据库的所有信息配置到配置文件中。
public class JDBCTest03 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Statement stmt = null;
        Connection conn = null;
        try {
            //1.注册驱动
            Class.forName(driver);

            //2.获取链接
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象 ---> " + conn);

            //3.获取数据库操作对象（Statament专门执行SQL语句的）
            stmt = conn.createStatement();

            //4.执行SQL语句
            //添加
            String sql = "insert into dept(deptno, dname, loc) values(60, '人事部','北京')";
            //删除
            //String sql = "delete from dept where deptno = 40";
            //更新
            //String sql = "update dept set loc='天津', dname = '销售部' where deptno = 30";
            // int executeUpdate() 专门执行DML语句的(insert delete update)
            //返回值是”影响数据库中的记录条数“
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功":"保存失败");

            //5.处理查询结果集

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            //为了保证资源一定释放。再finlly语句块中关闭资源。
            //并且要遵循从小到大依次关闭。
            //分别对其try...catch
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
