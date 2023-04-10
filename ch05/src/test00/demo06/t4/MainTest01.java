package test00.demo06.t4;

import test00.demo06.Student;

import java.util.function.Function;

/**
 * 把 字符串 转换为 学生对象 - T：字符串、R：Student
 *
 * Function<T,R>
 *
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        String str = "张三,18" ;

        // 函数式接口直接使用 - R apply(T t);
        Function<String, Student> function = (s) -> {
            // 1.根据逗号拆分字符串
            String[] arr = s.split(",");

            // 2.获取学生的信息
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);

            // 3.实例化学生对象
            Student stu = new Student(name,age) ;

            return stu;
        } ;

        Student stu = function.apply(str);
        System.out.println(stu);
    }
}
