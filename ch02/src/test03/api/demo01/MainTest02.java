package test03.api.demo01;

import org.entity.Student;

import java.lang.reflect.Constructor;

/**
 * API操作
 * 第一：获取类的Class对象
 *
 * 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
 *
 * 获取类的无参构造方法 : class对象.getConstructor();
 * 获取类的有参构造方法 : class对象.getConstructor(形参类型.class,形参类型.class,…) ;
 *
 *
 *
 *
 *
 * @Date 2023-03-16
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) throws Exception{
        // 第一：获取类的Class对象
        Class<?> clazz = Class.forName("org.entity.Student") ;


        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取类的构造方法对象
        Constructor<?> constructor =
                clazz.getConstructor(String.class,int.class) ;

        // 2.通过构造方法对象实例化对象
        Object obj = constructor.newInstance("张三",18);

        // 3.向下转型
        if(obj instanceof Student) {
            Student stu = (Student) obj ;
            stu.show();
        }



    }
}
