package test03.api.demo05;

import org.entity.Student;

import java.lang.reflect.Modifier;

/**
 * 修饰符的基本操作
 *      1）getModifiers()：返回修改符的常量值
 *
 *      2）Modifier.toString(修饰符常量值) ：返回修饰符常量值对应的字符串表示
 *
 *      3）isXxx(修饰符常量值)：判断修饰符是否为Xxx
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
        // 1.获取 Student 类的访问修饰符
        int intModifier = clazz.getModifiers();

        // 2.把修饰符常量的表示 转换为 字符串表示
        String strModifier = Modifier.toString(intModifier);

        // 3.判断是否为指定的修饰符
        // boolean flag = Modifier.isPrivate(intModifier);
        boolean flag = Modifier.isPublic(intModifier);

        System.out.println("修饰符(整数表示)：" + intModifier);
        System.out.println("修饰符（字符串表示）：" + strModifier);
        System.out.println("是否为public：" + flag);
    }
}
