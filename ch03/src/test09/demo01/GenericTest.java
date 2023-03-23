package test09.demo01;

/**
 * 边界：把泛型默认为 Object 类型，收窄到指定类型的范围
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class GenericTest {
    // 当定义一个泛型时，如果不指定具体的类型，则默认为 Object
    public static <T extends Comparable> int compare(T x, T y) {
        // 思考：以下代码为什么错误？
        // T 默认解析为 Object类型，因此 x 对象为 Object对象
        // 而 Object类中，并不存在 compareTo方法 - 因此，编译时错误
        // 如果解决？ - 设置边界
        return x.compareTo(y);
    }
}
