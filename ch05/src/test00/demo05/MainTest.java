package test00.demo05;

import java.util.function.Consumer;

/**
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {

    /**
     * 组合多个 Consumer 对象，实现对 学生数组 进行相关的消费（处理）
     *
     * @param students  处理的数据
     * @param consumer1 输出姓李的学生信息
     * @param consumer2 名字有三个字的学生信息
     * @param consumer3 年龄大于18岁的学生
     */
    public static void print(Student[] students,
                             Consumer<Student[]> consumer1,
                             Consumer<Student[]> consumer2,
                             Consumer<Student[]> consumer3) {
        consumer1
                .andThen(consumer2)
                .andThen(consumer3)
                .accept(students);
    }

    public static void main(String[] args) {
        // 定义学生数组
        Student[] students = {
                new Student("张三丰", 300),
                new Student("张无忌", 20),
                new Student("张翠山", 50),
                new Student("赵敏", 18),
                new Student("小昭", 15),
                new Student("李小龙", 30)
        };

        // void accept(T t);
        print(students, (stus) -> {
            System.out.println("输出姓李的学生信息");
            for (Student student : stus) {
                if (student.getName().startsWith("李")) {
                    System.out.println(student);
                }
            }
        }, (stus) -> {
            System.out.println("名字有三个字的学生信息");
            for (Student student : stus) {
                if (student.getName().length() == 3) {
                    System.out.println(student);
                }
            }
        }, (stus) -> {
            System.out.println("年龄大于18岁的学生");
            for (Student student : stus) {
                if (student.getAge() > 18) {
                    System.out.println(student);
                }
            }
        });
    }
}
