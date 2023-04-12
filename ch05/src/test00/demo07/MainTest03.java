package test00.demo07;

import java.util.Optional;

/**
 * @Date 2023-04-12
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        Student stu = new Student(null, 18);

        // 第一：创建一个 Optional 对象，并指定 包装的 具体的数据
        Optional<Student> optional = Optional.ofNullable(stu);

        // 第二：调用 Optional 对象相关的 API 方法，进行相关操作
        // R apply(T t) - t：学生对象 、R：字符串对象（姓名）
        String msg =  optional.map(Student::getName).map(String::toLowerCase).orElse("匿名");
        System.out.println(msg);

    }
}
