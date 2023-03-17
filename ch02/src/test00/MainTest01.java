package test00;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：获取类的Class对象
        Class<Integer> clazz = Integer.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取类的所有字段
        Field[] fields = clazz.getDeclaredFields();

        // 1.1、获取类的修饰符
        int intClassModifier = clazz.getModifiers();
        String strClassModifier = Modifier.toString(intClassModifier) ;

        // 1.2、获取类的名称 - 简单名称
        String classSimpleName = clazz.getSimpleName() ;

        System.out.println(strClassModifier + " class " + classSimpleName + " {") ;

        // 2.循环遍历字段的相关信息
        for (Field field : fields) {
            // 2.1、获取字段的修饰符
            int intModifier = field.getModifiers();
            String strModifier = Modifier.toString(intModifier);

            // 2.2、获取字段的数据类型 - 简单类型
            String simpleName = field.getType().getSimpleName();

            // 2.3、获取字段的名称
            String fieldName = field.getName();

            System.out.println("\t" + strModifier + " " + simpleName + " " + fieldName + " ;");
        }

        System.out.println("}");

    }
}
