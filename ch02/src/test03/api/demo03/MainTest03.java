package test03.api.demo03;

import org.entity.Student;

import java.lang.reflect.Method;


/**
 * 方法的操作
 * <p>
 * 第一：获取具体的某个方法对象
 * Method method = class对象.getMethod("方法名"[,参数类型的Class对象,...]) ;
 * <p>
 * Method method = class对象.getDeclareMethod("方法名"[,参数类型的Class对象,...]) ;
 * <p>
 * 注意：如果方法非公开，则需要设置私有方法可访问
 * Method对象.setAccessible(true) ;
 * <p>
 * <p>
 * 第二：调用方法
 * [数据类型 变量 = ]method.invoke(实例对象[,实参列表]) ;
 *
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest03 {

    public static void main(String[] args) throws Exception {
        // 第一：获取类的 Class 对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.实例化对象
        Student stu = clazz.getConstructor().newInstance();

        // 2.获取要操作的方法对象
        Method sumMethod = clazz
                .getDeclaredMethod("sum", int.class, int.class);

        // 3.开启访问权限
        sumMethod.setAccessible(true);

        // 4.调用方法
        int msg = (int) sumMethod.invoke(stu, 1, 1);

        System.out.println("返回结果：" + msg);

    }

}
