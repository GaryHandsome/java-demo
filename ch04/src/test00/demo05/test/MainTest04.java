package test00.demo05.test;

import test00.demo05.DbUtil;
import test00.demo05.SqlRunner;
import test00.demo05.Staff;

import java.util.List;

/**
 * 测试查询操作
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) {
        // 第一：实例化SqlRunner对象
        SqlRunner sqlRunner = new SqlRunner(DbUtil.getConnection());

        // 第二：定义要操作数据库的 SQL 语句 - 增、删、改
        String sql = "select id,name,age,sta_pos as staPos from staffs";

        // 第三：执行SQL语句
        List<Staff> list = sqlRunner.executeQuery(Staff.class,sql);
    }
}
