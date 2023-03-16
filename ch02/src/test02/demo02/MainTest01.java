package test02.demo02;



import org.entity.Student;

import java.lang.reflect.Method;

/**
 * 获取Class对象 - 方法二
 * <p>
 * 语法：类名.class
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一：获取类的 Class 对象
        Class<?> clazz = Student.class ;

        // 第二：通过Class对象进行相关的操作
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
