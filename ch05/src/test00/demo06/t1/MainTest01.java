package test00.demo06.t1;

import test00.demo06.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Supplier;

/**
 * 测试
 *
 * @Date 2023-04-10
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 定义一个数组，用于存储多个学生
        Student[] arrs = {
                new Student("张三",18) ,
                new Student("李四",48) ,
                new Student("王五",8) ,
                new Student("赵六",58) ,
                new Student("钱七",38)
        } ;

        // 1.直接使用函数式接口 - T get();
        Supplier<Student> supplier = () -> {

            // 1.根据年龄进行升序排序 - int compare(T o1, T o2);
            // Arrays.sort(arrs,(stu1, stu2)->stu1.getAge() - stu2.getAge());
            Arrays.sort(arrs, Comparator.comparingInt(Student::getAge));

            // 2.排序后，返回数组中的第一个元素
            return arrs[0] ;
        } ;

        Student youngStudent = supplier.get();
        System.out.println(youngStudent);


    }
}
