package test02.demo4;


import org.entity.Student;

import java.lang.reflect.Method;

/**
 * 获取Class对象 - 方法四
 * <p>
 * 语法：包装类.TYPE -> 获取包装类对应的基本类型的Class对象
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 第一：获取类的 Class 对象 - int.class
        Class<?> clazz1 = Integer.TYPE;
        Class<?> clazz2 = int.class;
        Class<?> clazz3 = Integer.class;

        // 第二：通过Class对象进行相关的操作
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    }
}
