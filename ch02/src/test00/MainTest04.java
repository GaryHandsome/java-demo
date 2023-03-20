package test00;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @Date 2023-03-20
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) throws Exception{
        // 第一：获取类的 Class 对象
        Class<Scanner> scannerClass = Scanner.class;
        Class<?> stringClass = Class.forName("java.lang.String");

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取Scanner类的构造方法对象
        Constructor<Scanner> scannerConstructor = scannerClass.getConstructor(InputStream.class);

        // 2.实例化Scanner对象
        Scanner sc = scannerConstructor.newInstance(System.in);

        // 3.获取 Scanner 类的 next()方法对象
        Method nextMethod = scannerClass.getMethod("next");

        // 4.调用方法，从键盘获取输入的字符串
        String email = (String)nextMethod.invoke(sc);

        // 5.继续反射操作 - 获取字符串要操作的 substring、indexOf方法对象
        Method substringMethod = stringClass.getMethod("substring",int.class,int.class) ;
        Method indexOfMethod = stringClass.getMethod("indexOf",int.class) ;

        // 6.调用方法，实现具体的业务功能
        // System.out.println("aaa@qq.com".indexOf('@'));
        // 6.1获取 @ 字符在 email 的下标索引位置
        int endIndex = (int)indexOfMethod.invoke(email, '@');

        // 6.2截取字符串，获取帐号名 - email.substring(0,endIndex)
        String username = (String)substringMethod.invoke(email, 0, endIndex);

        System.out.println("用户名为："+username);
    }
}
