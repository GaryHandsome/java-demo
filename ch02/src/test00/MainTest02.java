package test00;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Date 2023-03-17
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 第一：获取类的Class对象
        Class<String> clazz = String.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取所有定义的方法
        Method[] methods = clazz.getDeclaredMethods();

        // 2.循环遍历所有定义的方法
        for (Method method : methods) {
            // 2.1、获取方法修饰符字符串的表示
            String modifier = Modifier.toString(method.getModifiers());

            // 2.2、获取方法返回值类型名称
            String returnSimpleName = method.getReturnType().getSimpleName();

            // 2.3、获取方法名称
            String methodName = method.getName();

            // 2.4、获取方法参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                // 获取方法参数类型名称
                String parameterSimpleName = parameterTypes[i].getSimpleName();


            }


        }




    }
}
