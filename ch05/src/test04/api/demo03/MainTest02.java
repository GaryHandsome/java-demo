package test04.api.demo03;

import java.util.function.Consumer;

/**
 * Consume<T>接口 - 消费型接口
 * <p>
 * 函数式接口作为方法参数的使用
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest02 {

    /**
     * 实现把字符串转换为大写输出
     *
     * @param content
     * @param consumer
     */
    public static void change(String content,
                              Consumer<String> consumer) {
        // 实现一些逻辑处理....
        consumer.accept(content);
        // 实现一些逻辑处理....
    }

    public static void main(String[] args) {
        // 1.匿名内部类实现
        change("abc", new Consumer<String>() {
            @Override
            public void accept(String s) {
                // 实现一些逻辑处理....
                System.out.println(s.toUpperCase());
            }
        }) ;

        // 2.Lambda表达式实现 - void accept(T t);
        change("deg",(str)->{
            System.out.println(str.toUpperCase());
        });

    }
}
