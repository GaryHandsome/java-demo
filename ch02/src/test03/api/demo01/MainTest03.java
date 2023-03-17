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
public class MainTest03 {
    public static void main(String[] args) throws Exception{
        // 第一：获取类的Class对象
        Class<Student> clazz = Student.class;
        // Class<?> aClass = Class.forName("org.entity.Student");

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取类的构造方法对象
        // 注意：如果构造方法的参数为包装类型，则传递实参时必须为对应的包装类型
        Constructor<Student> constructor = clazz.getConstructor(String.class,int.class,Double.class);

        // 2.使用构造方法对象实例化类的对象
        // 错误 - 60默认为int类型的数据
        // Student ls = constructor.newInstance("李四", 20, 60);

        Student ls = constructor.newInstance("李四", 20, 60.0);
        // Student ls = constructor.newInstance("李四", 20, new Double(60));

        // 3.调用方法 - 传统
        ls.show();

    }
}
