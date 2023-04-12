package test07.stream.test02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 中间操作：skip(N) - 跳过 Stream 中前面的N个元素
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<String> list = Arrays.asList("张三","李四","张三丰","王五") ;

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）
        Stream<String> stream = list.stream();

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - boolean test(T t);
        stream.skip(2).forEach(System.out::println);
        // stream.skip(20).forEach(System.out::println);

    }
}
