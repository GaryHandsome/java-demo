package test00.demo06.t4;

import test00.demo06.Student;

import java.util.function.Function;

/**
 * 把 字符串 转换为 学生对象 - T：字符串、R：Student
 * <p>
 * Function<T,R>
 *
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest02 {

    /**
     * 函数式接口作为方法参数的使用
     *
     * @param str  数据转换的源数据
     * @param fun1 String -> 学生对象
     * @param fun2 学生对象 -> Integer
     */
    private static Integer change(String str,
                                  Function<String, Student> fun1,
                                  Function<Student, Integer> fun2) {
        return fun1.andThen(fun2).apply(str);
    }


    public static void main(String[] args) {
        String str = "张三,18";

        // 调用自定义方法 - R apply(T t);
        Integer jg = change(str, (s) -> {
            String[] arr = s.split(",");
            return new Student(arr[0], Integer.parseInt(arr[1]));
        }, (stu) -> stu.getAge() + 1);

        System.out.println(jg);
    }
}
