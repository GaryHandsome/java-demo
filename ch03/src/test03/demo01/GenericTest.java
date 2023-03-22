package test03.demo01;

/**
 * 第一：定义泛型类 - 只有一个泛型
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public class GenericTest<T> {

    /**
     * 打印输出 T 类型的数据
     *
     * @param msg
     */
    public void sayHello(T msg) {
        System.out.println("你好，" + msg);
    }
}
