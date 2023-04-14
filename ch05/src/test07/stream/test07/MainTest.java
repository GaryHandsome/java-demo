package test07.stream.test07;

import test07.stream.test06.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 匹配：具体匹配条件根据业务需求来决定
 *
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：定义数据源 - 数组、集合
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 28);
        Student s3 = new Student("王五", 38);
        Student s4 = new Student("赵六", 48);

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        // 第二：把数据源转化为 Stream 对象 - 流对象只能使用一次
        // Stream<Student> stream = list.stream();

        // 第三：操作 -
        Optional<Student> optional1 = list.stream().findFirst();
        System.out.println(optional1.get().getName());

        Optional<Student> optional2 = list.parallelStream().findAny();
        System.out.println(optional2.get().getName());


    }
}
