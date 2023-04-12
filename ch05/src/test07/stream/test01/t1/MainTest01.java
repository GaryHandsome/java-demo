package test07.stream.test01.t1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 实例化流对象 - 集合对象
 * - 串行流：集合对象.stream()
 * - 并行流：集合对象.parallelStream()
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<String> list = Arrays.asList("AA","BB","CC","DD") ;

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）
        Stream<String> stream = list.stream();

        // 第三：操作 - API - 延迟方法(1...N)、终结方法
        // Consumer<? super T> action -  void accept(T t);
        // stream.forEach((t)->System.out.println(t));
        stream.forEach(System.out::println);
    }
}
