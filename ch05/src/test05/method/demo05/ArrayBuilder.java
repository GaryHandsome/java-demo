package test05.method.demo05;

/**
 * 创建指定类型的数组的工具类
 *
 * @Date 2023-04-07
 * @Author zqx
 */
@FunctionalInterface
public interface ArrayBuilder<T> {
    /**
     * 创建一个指定长度T类型的数组
     *
     * @param len
     * @return
     */
    T[] create(int len);
}
