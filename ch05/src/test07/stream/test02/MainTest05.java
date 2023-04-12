package test07.stream.test02;

import java.util.stream.Stream;

/**
 * 中间操作：distinct - 去重
 *
 * 注意：如果集合中的元素是自定义对象，则必须重写 equals方法、hashCode方法
 *
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest05 {
    public static void main(String[] args) {
        // 第一：定义数据源（数组、集合） - 集合
        Student[] arr = {
                new Student("张三",18) ,
                new Student("李四",28) ,
                new Student("王王",38) ,
                new Student("张三",18)
        } ;

        // 第二：根据数据源，实例化 Stream 对象 - 串行流（顺序流）
        Stream<Student> stream = Stream.of(arr) ;

        // 第三：操作 - API - 延迟方法(1...N)、终结方法 - boolean test(T t);
        stream.distinct().forEach(System.out::println);

    }
}
