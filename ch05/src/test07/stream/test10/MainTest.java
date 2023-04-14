package test07.stream.test10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Date 2023-04-14
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：定义数据源，并获取对应的流对象
        Student s1 = new Student("张三", 18,"男");
        Student s2 = new Student("李四", 28,"女");
        Student s3 = new Student("王五", 38,"女");
        Student s4 = new Student("赵六", 48,"男");

        List list = Arrays.asList(s1,s2,s3,s4);




    }
}
