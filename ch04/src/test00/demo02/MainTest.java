package test00.demo02;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        int n = 100;

        // 解析注解
        // 1.获取要操作类的 class 对象
        Class<JiSuanUtil> clazz = JiSuanUtil.class;

        // 2.调用相关的API方法，获取类的相关信息(Field、Method、Constructor、Annotation)，进而进行相关操作
        // 2.1）获取方法对象
        Method method = clazz.getMethod("getSum", int.class);

        // 2.2）获取方法的参数对象
        Parameter[] parameters = method.getParameters();

        // 2.3）判断方法参数是否存在某个注解
        boolean isExist = parameters[0].isAnnotationPresent(MaxData.class);

        if (isExist) {
            // 2.4）获取方法参数上的注解对象
            MaxData annotation = parameters[0].getAnnotation(MaxData.class);

            // 2.5）获取方法参数上的注解的内容
            int max = annotation.value();

            // 2.6）进行逻辑处理
            if(n > max) {
                throw new RuntimeException("对不起，我们只能计算1-" + max + "的和，当前为：" + n) ;
            }
        }

        System.out.println(JiSuanUtil.getSum(n));
    }
}
