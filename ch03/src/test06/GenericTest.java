package test06;

/**
 * 泛型方法的使用
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class GenericTest {

    /**
     * 第一：定义泛型方法 - 单个泛型
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

    /**
     * 第一：定义泛型方法 - 多个泛型
     *
     * @param s1
     * @param s2
     * @param s3
     * @param <T1>
     * @param <T2>
     * @param <T3>
     */
    public <T1, T2, T3> void sayGoodBye(T1 s1, T2 s2, T3 s3) {
        System.out.println(s1.getClass().getName() + ":" + s1);
        System.out.println(s2.getClass().getName() + ":" + s2);
        System.out.println(s3.getClass().getName() + ":" + s3);
    }
}
