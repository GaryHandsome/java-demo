package test00;

import org.entity.Student;

import java.lang.reflect.Array;

/**
 * 课堂练习：创建一个学生类型的数组，存放三个学生，循环遍历输出
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest05 {
    public static void main(String[] args) {
        // 第一：创建数组
        Object obj = Array.newInstance(Student.class, 3);

        // 第二：初始化数组
        // 1.实例化相关的学生对象
        Student stu1 = new Student("zs", 18, 60.0);
        Student stu2 = new Student("ls", 22, 45.0);
        Student stu3 = new Student("ww", 33, 55.0);

        // 2.初始化
        Array.set(obj, 0, stu1);
        Array.set(obj, 1, stu2);
        Array.set(obj, 2, stu3);

        // 第三：使用数组
        // 1.获取数组的长度
        int len = Array.getLength(obj);

        // 2.循环遍历输出
        for (int i = 0; i < len; i++) {
            // 2.1）获取下标i对应的数组元素 - 学生对象
            Object o = Array.get(obj, i);

            // 2.2）向下转型
            Student stu = (Student) o;

            // 2.3）输出具体的数据
            System.out.println("姓名：" + stu.getName());
            System.out.println("年龄：" + stu.getAge());
            System.out.println("体重：" + stu.getWeight());
            System.out.println();
        }
    }
}
