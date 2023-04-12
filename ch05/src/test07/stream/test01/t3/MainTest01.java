package test07.stream.test01.t3;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 实例化流对象 - 创建无限流
 *  迭代
 *  public static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
 *
 *  生成
 *  public static<T> Stream<T> generate(Supplier<T> s)
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 1.获取流对象，流对象的元素从0开始，每迭代一次加2 - T apply(T t);
        Stream stream = Stream.iterate(0,t -> t + 2);

        // 2.输出前面10个元素
        stream.limit(10).forEach(System.out::println);
    }
}
