package test07.stream.test02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 中间操作：filter
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<String> list = Arrays.asList("张三","李四","张三丰","王五") ;

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）
        // Stream<String> stream1 = list.stream();

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - boolean test(T t);
        // Stream<String> stream2 = stream1.filter((name) -> name.startsWith("张"));

        // stream2.forEach(System.out::println);

        // 链式操作
        list.stream()
                .filter(name->name.startsWith("张"))
                .forEach(System.out::println);

    }
}
