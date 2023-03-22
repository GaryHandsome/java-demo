package test05;

/**
 * 泛型接口
 *
 * @Date 2023-03-22
 * @Author zqx
 */
public interface GenericTest<T> {
    // 注意：在泛型接口中，泛型不能定义常量
    String msg = "好好学习，天天向上";

    // 接口中的泛型可以定义方法参数、方法返回值
    T sayHello(T msg);
}
