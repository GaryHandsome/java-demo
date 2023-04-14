package test07.stream.test10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 第一：定义数据源，并获取对应的流对象
        Student s1 = new Student("张三", 18,"男");
        Student s2 = new Student("李四", 28,"女");
        Student s3 = new Student("王五", 38,"女");
        Student s4 = new Student("赵六", 48,"男");

        List<Student> list = Arrays.asList(s1, s2, s3, s4);

        // 第二：操作 -- 分组操作 - 1.根据性别分组 -  R apply(T t);
        Map<String, List<Student>> map = list.stream()
                .collect(Collectors.groupingBy(stu -> stu.getSex()));

        System.out.println("分组大小：" + map.size());
        // kev：按哪个数据进行分组 - 性别 - value : 分组的结果
        map.forEach((k, v) -> {
            System.out.println(k);
            System.out.println("\t" + v);
        });
    }
}
