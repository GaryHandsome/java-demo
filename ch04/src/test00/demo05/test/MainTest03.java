package test00.demo05.test;

import test00.demo05.DbUtil;
import test00.demo05.SqlRunner;

/**
 * 测试删除操作
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 第一：实例化SqlRunner对象
        SqlRunner sqlRunner = new SqlRunner(DbUtil.getConnection());

        // 第二：定义要操作数据库的 SQL 语句 - 增、删、改
        String sql = "delete from staffs where id=?";

        // 第三：执行SQL语句
        int r = sqlRunner.executeUpdate(sql, 1);
        System.out.println(r);
    }
}
