package test02.demo3;



import org.entity.Student;

import java.lang.reflect.Method;

/**
 * 获取Class对象 - 方法三
 * <p>
 * 语法：对象名.getClass() 或 class对象.getSuperclass()
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student stu = new Student();

        // 第一：获取类的 Class 对象
        Class<?> clazz = stu.getClass();
        Class<?> fatherClazz = clazz.getSuperclass();

        // 第二：通过Class对象进行相关的操作
        Method[] methods = fatherClazz.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
