package test07.stream.test06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        // 第三：操作 - boolean test(T t);
        boolean bl1 = list.stream().allMatch((stu) -> stu.getAge() > 18);
        System.out.println(bl1);

        boolean bl2 = list.stream().anyMatch((stu) -> stu.getAge() >= 48);
        System.out.println(bl2);

        boolean bl3 = list.stream().noneMatch((stu) -> stu.getAge() >= 48);
        System.out.println(bl3);


    }
}
