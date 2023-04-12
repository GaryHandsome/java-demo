package test07.stream.test05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 中间操作：concat - 组合多个流
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<Integer> list1 = Arrays.asList(3, 1, 4, 6, 7, 8, 5);

        Integer[] arr = {11,22,33} ;

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - R apply(T t);
        Stream<Integer> stream1 = list1.stream();
        Stream<Integer> stream2 = Stream.of(arr);

        Stream.concat(stream1,stream2).forEach(System.out::println);


    }
}
