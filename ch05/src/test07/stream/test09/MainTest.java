package test07.stream.test09;

import java.util.stream.Stream;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 7, 5, 4, 8, 3};

        // R apply(T t, U u);
        Integer sum = Stream.of(arr)
                .reduce(0, (t,u) ->  t+u);
        System.out.println(sum);
    }
}
