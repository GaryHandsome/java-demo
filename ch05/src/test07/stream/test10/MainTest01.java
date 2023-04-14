package test07.stream.test10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：定义数据源，并获取对应的流对象
        Integer[] arr = {100,200,300,100} ;

        // 第二：获取流对象，实现相关的操作
        // List<Integer> list = Stream.of(arr).collect(Collectors.toList());
        // System.out.println(list);

        Set<Integer> set = Stream.of(arr).collect(Collectors.toSet());
        System.out.println(set);

    }
}
