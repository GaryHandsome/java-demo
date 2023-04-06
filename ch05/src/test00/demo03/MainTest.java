package test00.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 测试
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 28);
        Student s3 = new Student("王五", 38);
        Student s4 = new Student("赵六", 58);
        Student s5 = new Student("田七", 48);

        Student[] arr = {s1, s2, s3, s4, s5};

        System.out.println("排序之前");
        for (Student stu : arr) {
            System.out.println(stu);
        }


        /*
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        */

        // int compare(T o1, T o2);
        Arrays.sort(arr, (stu1, stu2) -> stu2.getAge() - stu1.getAge());

        System.out.println();
        System.out.println("排序之后");
        for (Student stu : arr) {
            System.out.println(stu);
        }
    }
}
