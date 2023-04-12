package test00.demo08;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：定义数据源（集合、数组）
        Student[] students = {
           new Student("张三",18),
           new Student("李四",18),
           new Student("李五五",17),
           new Student("李六六",38),
           new Student("李七七",28),
           new Student("李八八",68),
           new Student("王五",28)
        } ;

        // 第二：把数据源转换为流（Stream）
        Stream<Student> stream = Arrays.stream(students);


        // 第三：操作（API）
        // boolean test(T t);
        // int compare(T o1, T o2);
        // R apply(T t);
        stream.filter((stu)->stu.getName().startsWith("李"))
                .filter((stu)->stu.getAge()>18)
                .sorted((stu1, stu2)->stu2.getAge()-stu1.getAge())
                .map((stu)->stu.getName())
                .limit(2)
                .forEach(System.out::println);
    }
}
