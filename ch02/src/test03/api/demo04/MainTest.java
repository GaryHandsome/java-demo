package test03.api.demo04;

import org.entity.Student;

/**
 * 包的操作
 *  Package package对象 = clazz.getPackage() ;
 *
 *  String packageName = package对象.getName() ;
 *
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 第一：获取类的Class对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取类的包对象
        Package studentPackage = clazz.getPackage();

        // 2.获取包的名称
        String packageName = studentPackage.getName();
        System.out.println("Student类所在包为："+packageName);

    }
}
