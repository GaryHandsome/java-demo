package test00.demo09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream API的综合应用
 *
 * @Date 2023-04-17
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 分别定义两个集合，用于存储若干姓名
        List<String> list1 = Arrays.asList("张三三", "张三丰", "李四四", "李小龙", "成龙", "刘德华", "莫维栋");
        List<String> list2 = Arrays.asList("张无忌", "张翠山", "张王五", "张六六", "张七七", "刘德华", "张家辉","吴八八","孙九群");

        // 1：第一个List集合中，筛选姓名有三个字的学生，存储到一个新的集合中
        //  boolean test(T t);
        // 2：第一个List集合筛选后只取前3人，存储到新的集合中
        List<String> list1_1 = list1.stream().filter((name) -> name.length() == 3).limit(3).collect(Collectors.toList());

        // 3：第二个List集合中只要姓张的学生，存储到新的集合中
        // 4：第二个List集合筛选后，跳过前2人，存储到新的集合中
        List<String> list2_1 = list2.stream().filter((name) -> name.startsWith("张")).skip(2).collect(Collectors.toList());

        // 5.合并两个List集合，存储到新的集合中
        // 6：在合并的List集合中，根据姓名实例化学生类对象，存储到新的集合中
        // 7：打印输出学生对象集合的信息
        // R apply(T t);
        Stream.concat(list1_1.stream(), list2_1.stream())
                .map(Student::new)
                .forEach(System.out::println);
    }
}

