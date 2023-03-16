package test02.demo01;

import java.lang.reflect.Method;

/**
 * 获取Class对象 - 方法一
 * <p>
 * 语法：Class.forName("包名.类名") ;
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一：获取类的 Class 对象
        Class<?> clazz = Class.forName("org.entity.Student");

        // 第二：通过Class对象进行相关的操作
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
