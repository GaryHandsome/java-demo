package test07.stream.test01.t2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 实例化流对象 - 数组对象
 * - Arrays.stream(数组)
 * - Stream.of(元素集合|数组)
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合 - 如果是基本数据类型，必须使用对应的包装类型
        Integer[] arr = {11,22,33,44,55} ;

        // 第二：根据数据源，实例化 Stream 对象
        Stream<Integer> stream = Arrays.stream(arr) ;

        // 第三：操作 - API - 延迟方法(1...N)、终结方法
        // Consumer<? super T> action -  void accept(T t);
        // stream.forEach((t)->System.out.println(t));
        stream.forEach(System.out::println);
    }
}
