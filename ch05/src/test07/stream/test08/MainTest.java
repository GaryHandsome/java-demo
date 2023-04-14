package test07.stream.test08;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 7, 5, 4, 8, 3};

        long count = Stream.of(arr).count();
        System.out.println("数组的数量：" + count);

        // 升序
        Optional<Integer> maxOptional = Stream.of(arr).max((o1, o2) -> o1 - o2);
        System.out.println("最大值："+maxOptional.get());

        Optional<Integer> minOptional = Stream.of(arr).min((o1, o2) -> o1 - o2);
        System.out.println("最小值："+minOptional.get());
    }
}
