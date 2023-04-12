package test07.stream.test03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 中间操作：map - 映射
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<String> list = Arrays.asList("1", "2", "3", "4");

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）
        // Stream<String> stream1 = list.stream();

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - R apply(T t);
        // Stream<Integer> stream2 = stream1.map((t) -> Integer.parseInt(t));
        // stream2.forEach(System.out::println);

        list.stream()
                .map(t->Integer.parseInt(t))
                .forEach(System.out::println);




    }
}
