package test00.demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


    private Connection connection;

    public SqlRunner(Connection connection) {
        this.connection = connection;
    }

    /**
     * 通用更新操作：执行 增、删、改的 SQL 语句
     * <p>
     * insert into staffs(name,age,phone,sta_pos)
     * values (?,?,?,?) ;
     *
     * @param sql
     * @param params 不定长参数，本质上是一个数组
     * @return
     */
    public int executeUpdate(String sql, Object... params) {
        // 第一：获取连接对象
        if (connection == null) {
            throw new RuntimeException("连接对象为null");
        }

        // 第二：预编译SQL语句
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);

            // 第三：填充参数
            setParameter(ps, params);

            // 第四：执行SQL语句
            // 第五：返回结果
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 第六：关闭相关的对象
            DbUtil.close(null, ps, connection);
        }
    }

    /**
     * 填充 SQL 语句中的占位符数据
     *
     * @param ps
     * @param params
     * @throws SQLException
     */
    private static void setParameter(PreparedStatement ps, Object[] params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }

    /**
     * 通用查询操作 - 返回的List集合
     *
     * @param clazz  实体对象的Class对象
     * @param sql    要执行查询语句
     * @param params 查询语句点位符数据
     * @param <T>    T为具体的实体类型对象
     * @return 返回的List集合
     */
    public <T> List<T> executeQuery(Class<T> clazz, String sql, Object... params) {

        // 第一：获取连接对象
        if (connection == null) {
            throw new RuntimeException("连接对象为null");
        }

        PreparedStatement ps = null;
        ResultSet rs = null ;

        try {
            // 第二：预编译SQL语句
            ps = connection.prepareStatement(sql);

            // 第三：填充参数
            setParameter(ps, params);

            // 第四：执行SQL语句 - ResultSet
            rs = ps.executeQuery();

            // 第五：对结果集进行处理 - 遍历结果集，读取结果集中的数据，封装到List集合
            while (rs.next()) {
                // 1.实例化实体对象 - 思考：实体对象是谁呢？ - 在这里，谁都可以，我们要做一个通用的查询 - 通过 clazz 这个参数来确定要操作的具体实体对象的Class对象
                T entity = clazz.getConstructor().newInstance();

                // 2.读取结果集各列的数据

                // 3.封装数据到实体对象中

                // 4.把实体对象添加到 List 集合中
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
            // 第六：关闭对象
            DbUtil.close(rs, ps, connection);
        }


        return null;
    }
}
