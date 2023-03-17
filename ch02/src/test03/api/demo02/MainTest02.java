package test03.api.demo02;

import org.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * 属性的操作
 *
 * 字段(属性)操作
 * 第一：获取要操作的字段（属性）
 *      Field field = clazz.getField(“字段名称”);
 *      Field field = clazz.getDeclaredField(“字段名称”);
 *
 * 第二：设置属性值
 *      field对象.set(对象,值) ;
 *
 *      注意：如果要访问私有的字段，必须要开启访问权限
 *      Field对象.setAccessible(true);
 *
 * 第三：获取属性值
 *      field对象.get(对象)
 *
 *
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest02 {

    public static void main(String[] args) throws Exception{
        // 第一：获取类的Class对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.实例化类的对象
        Student student = clazz.getConstructor().newInstance();

        // 2.获取要操作的字段（属性）
        Field field = clazz.getField("sex");

        // 3.设置属性值
        field.set(student,"男") ;

        // System.out.println(student.getSex());
        System.out.println(field.get(student));

    }

}
