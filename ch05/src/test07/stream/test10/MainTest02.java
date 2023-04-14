package test07.stream.test10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 第一：定义数据源，并获取对应的流对象
        Integer[] arr = {1, 2, 3, 1, 4};

        // 第二：获取流对象，实现相关的操作 - int applyAsInt(T value);
        Integer sum = Stream.of(arr).collect(Collectors.summingInt((t) -> t));
        Long count = Stream.of(arr).collect(Collectors.counting());

        System.out.println("数量：" + count);
        System.out.println("总和：" + sum);


    }
}
