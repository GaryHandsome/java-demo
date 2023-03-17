package test03.api.demo02;

import org.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 属性的访问
 *
 * 字段(属性)操作
 * 1）获取所有公共的字段
 * Field[] fs = Class对象.getFields() ;
 * <p>
 * 2）获取所有的字段
 * Field[] fs = Class对象.getDeclaredFields() ;
 *
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest01 {

    public static void main(String[] args) {
        // 第一：获取类的Class对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取类的公开字段（属性）
        // Field[] fields = clazz.getFields();

        // 2.获取类的所有字段（属性）
        Field[] fields = clazz.getDeclaredFields();

        // 3.循环遍历数据字段的相关信息
        System.out.println("字段的数量：" + fields.length);
        for (Field field : fields) {
            // 3.1、获取字段名称
            System.out.println("字段名称：" + field.getName());


            // 3.2、获取数据类型的Class对象
            Class<?> typeClazz = field.getType();

            // getName()：如果是对象类型，则返回完整的包名.类型名称
            // getSimpleName()：不管是什么类型，返回的都是简单的类型名称（没有包名）
            String typeName = typeClazz.getName();
            String typeSimpleName = typeClazz.getSimpleName();

            // 3.3、获取访问修饰符
            int intModifier = field.getModifiers();
            String strModifier = Modifier.toString(intModifier);


            System.out.println("字段类型名称（包名.类名）：" + typeName);
            System.out.println("字段类型名称（简单名称）：" + typeSimpleName);
            System.out.println("字段访问修饰符（整型常量）：" + intModifier);
            System.out.println("字段访问修饰符（字符串）：" + strModifier);

            System.out.println();
        }

    }

}
