package test00.demo05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * SQL执行器 - 执行 增、删、改、查的这么一个工具类
 * <p>
 * 更新操作：insert、delete、update
 * 查询操作：select
 *
 * @Date 2023-03-29
 * @Author zqx
 */
public class SqlRunner {


    private Connection connection ;

    public SqlRunner(Connection connection) {
        this.connection = connection;
    }

    /**
     * 通用更新操作：执行 增、删、改的 SQL 语句
     *
     * insert into staffs(name,age,phone,sta_pos)
     * values (?,?,?,?) ;
     *
     * @param sql
     * @param params 不定长参数，本质上是一个数组
     * @return
     */
    public int executeUpdate(String sql, Object... params) {
        // 第一：获取连接对象
        // 第二：预编译SQL语句
        PreparedStatement ps = null ;
        try {
            ps = connection.prepareStatement(sql);
            // 第三：填充参数
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i+1,params[i]) ;
            }
            // 第四：执行SQL语句
            // 第五：返回结果
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 第六：关闭相关的对象
            DbUtil.close(null,ps,connection);
        }
    }

    /**
     * 通用查询操作 - 返回的List集合
     *
     * @param clazz 实体对象的Class对象
     * @param sql 要执行查询语句
     * @param params 查询语句点位符数据
     * @param <T> T为具体的实体类型对象
     * @return 返回的List集合
     */
    public <T> List<T> executeQuery(Class<T> clazz, String sql, Object... params) {

        return null;
    }
}
