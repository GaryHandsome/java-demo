package test03.api.demo03;

import org.entity.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 方法的访问
 * <p>
 * 字段(属性)操作
 * 1）获取所有公开的方法
 * Method[] ms = Class对象.getMethods() ;
 * <p>
 * 2）获取所有的字段
 * Method[] ms = Class对象.getDeclaredMethods() ;
 * <p>
 * 3）获取方法的返回值
 * Class<?> typeClass = Method对象.getReturnType() ;
 * <p>
 * String typeName = typeClass.getName() ;
 * String typeSimpleName = typeClass.getSimpleName() ;
 * <p>
 * 4）获取方法的修饰符
 * int 整型表示 = Method对象.getModifiers() ;
 * String 字符表示 = Modifier.toString(整型表示) ;
 * <p>
 * 5）获取方法的参数
 * Class<?>[] paramTypesClass = Method对象.getParameterTypes() ;
 *
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest01 {

    public static void main(String[] args) {
        // 第一：获取类的 Class 对象
        Class<Student> clazz = Student.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取所有的公开方法
        Method[] methods = clazz.getMethods();

        // 2.循环遍历所有方法
        for (Method method : methods) {
            // 2.1、获取方法的访问修饰符
            int intModifier = method.getModifiers();
            String strModifier = Modifier.toString(intModifier);

            // 2.2、获取方法的返回值
            Class<?> returnTypeClazz = method.getReturnType();
            String returnName = returnTypeClazz.getName();
            String returnSimpleName = returnTypeClazz.getSimpleName();

            // 2.3、获取方法的名称
            String methodName = method.getName();

            System.out.println("修饰符：" + strModifier);
            System.out.println("方法名：" + methodName);
            System.out.println("方法返回值（包名.类名）：" + returnName);
            System.out.println("方法返回值（简单名称）：" + returnSimpleName);

            // 2.4、获取方法的参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("  参数类型名称（包名.类名）："+ parameterType.getName());
                System.out.println("  参数类型名称（简单名称）："+ parameterType.getSimpleName());
            }




            System.out.println();
        }

    }

}
