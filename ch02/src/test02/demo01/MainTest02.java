package test02.demo01;

import org.entity.Student;

import java.lang.reflect.Constructor;


/**
 * 获取Class对象 - 方法一
 * <p>
 * 语法：Class.forName("包名.类名") ;
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) throws Exception {
        // 第一：获取类的 Class 对象
        Class<?> clazz = Class.forName("org.entity.Student");

        // 第二：通过Class对象进行相关的操作 - API
        // Student stu = new Student();

        // 1.获取类的构造方法
        Constructor<?> constructor = clazz.getConstructor();

        // 2.使用构造方法实例化对象
        Object obj = constructor.newInstance();

        if(obj instanceof Student) {
            // 向下转型 - 把父类对象 转换为 子类对象
            Student stu = (Student)obj;
            stu.sayHello();
        }

    }
}
