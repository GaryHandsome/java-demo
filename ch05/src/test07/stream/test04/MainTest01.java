package test07.stream.test04;

import java.util.Arrays;
import java.util.List;

/**
 * 中间操作：sorted - 排序
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        List<Integer> list = Arrays.asList(3, 1, 4, 6, 7, 8, 5);

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - R apply(T t);
        // list.stream().sorted().forEach(System.out::println);
        // int compare(T o1, T o2);
        list.stream().sorted((o1,o2)->o2-o1).forEach(System.out::println);



    }
}
