package test07.stream.test01.t3;

import java.util.Random;
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
public class MainTest02 {
    public static void main(String[] args) {
        // 生成一个产生10以内随机数的流对象 - T get();
        Stream stream = Stream.generate(()->new Random().nextInt(10));

        // 获取流的前面 10 个元素 - limit方法对流进行截取，截取前面 N 个元素
        stream.limit(10).forEach(System.out::println);
    }
}
