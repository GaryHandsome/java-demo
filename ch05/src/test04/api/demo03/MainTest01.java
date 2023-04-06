package test04.api.demo03;

import java.util.function.Consumer;

/**
 * Consume<T>接口 - 消费型接口
 * <p>
 * 直接使用
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 1.定义实现类（略）

        // 2.匿名内部类
        Consumer<String> consume1 = new Consumer<>() {
            @Override
            public void accept(String s) {
                // 在当前的 accept 方法中，对数据s进行消费（处理） - 根据实际的业务
                System.out.println(s.toUpperCase());
            }
        } ;
        consume1.accept("good good study");

        // 3.Lambda表达式实现 - void accept(T t);
        Consumer<String> consume2 = (t) -> {
            System.out.println(t.toUpperCase());
        } ;
        consume2.accept("day day up");

    }
}
