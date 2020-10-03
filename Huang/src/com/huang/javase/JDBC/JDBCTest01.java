package com.huang.javase.JDBC;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args){
        Statement stmt = null;
        Connection conn = null;
        //1.注册驱动
        Driver driver = null;
        try {
            driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //2.获取链接
            String url = "jdbc:mysql://127.0.0.1:3306/huang";
            String user = "root";
            String password = "981222";
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("数据库连接对象 ---> " + conn);

            //3.获取数据库操作对象（Statament专门执行SQL语句的）
            stmt = conn.createStatement();

            //4.执行SQL语句
            //添加
            String sql = "insert into dept(deptno, dname, loc) values(50, '人事部','北京')";
            //删除
            //String sql = "delete from dept where deptno = 40";
            //更新
            //String sql = "update dept set loc='天津', dname = '销售部' where deptno = 30";
            //int executeUpdate() 专门执行DML语句的(insert delete update)
            //返回值是”影响数据库中的记录条数“
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功":"保存失败");

            //5.处理查询结果集

        } catch (SQLException throwables) {
            throwables.printStackTrace();
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
