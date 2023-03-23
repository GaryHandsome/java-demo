package test06;

/**
 * 泛型方法的使用
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class GenericTest {

    /**
     * 第一：定义泛型方法
     *
     * @param sth
     * @param <T>
     * @return
     */
    public static <T> T sayHello(T sth) {
        T t = sth;

        // 注意：在当前代码中观察，无法确定 T 具体是什么类型
        // 只有在程序运行时，才能确定 T 具体是什么类型
        // 需求：获取 T 类型的名称 - 反射
        System.out.println("类型名称：" + sth.getClass().getSimpleName());
        System.out.println("T类型的值为：" + sth);

        return t;
    }
}
