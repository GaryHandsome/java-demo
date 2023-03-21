package test03.api.demo07;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过反射操作 - 跳过编译期，在运行时突破泛型的约束 - API
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) throws Exception{
        // 实例化一个List集合，并指定泛型
        List<String> list = new ArrayList<>() ;

        // 通过反射来添加元素
        // 第一：获取类的 Class 对象
        Class clazz = list.getClass();

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取要操作的方法对象 - list.add("")
        Method addMethod = clazz.getMethod("add",Object.class);
    }
}
