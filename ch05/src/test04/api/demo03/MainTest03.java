package test04.api.demo03;

import java.util.function.Consumer;

/**
 * Consume<T>接口 - 消费型接口
 * <p>
 * 函数式接口作为方法参数的使用
 * <p>
 * andThen()，Consumer接口中定义的默认方法，
 * 把两个Consumer接口组合到一起，对数据按顺序依次进行消费
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest03 {


    /**
     * 组多个Consumer对象
     *
     * @param content
     * @param consumer1 实现把字符串：content转化为大写
     * @param consumer2 实现把字符串：content转化为小写
     */
    public static void change(String content,
                              Consumer<String> consumer1,
                              Consumer<String> consumer2) {
        // 实现一些逻辑处理....
        consumer1.andThen(consumer2).accept(content);
        // 实现一些逻辑处理....
    }

    public static void main(String[] args) {
        // 1.匿名内部类实现
        change("Good Good Study", new Consumer<String>() {

            /**
             * 实现大写转换
             * @param s the input argument
             */
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        }, new Consumer<String>() {
            /**
             * 实现小写的转换
             * @param s the input argument
             */
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });

        // 2.Lambda表达式实现 - void accept(T t);
        change("Day Day Up",(s)->{
            System.out.println(s.toUpperCase());
        },(s)->{
            System.out.println(s.toLowerCase());
        });

    }
}
