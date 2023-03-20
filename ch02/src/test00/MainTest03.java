package test00;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @Date 2023-03-20
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) throws Exception{
        // 第一：获取类的 Class 对象
        Class<Scanner> scannerClass = Scanner.class;

        // 第二：通过Class对象中的方法来获取类的相关信息，并做相应的操作
        // 1.获取Scanner类的构造方法对象
        Constructor<Scanner> constructor =
                scannerClass.getConstructor(InputStream.class);

        // 2.实例化Scanner对象
        Scanner sc = constructor.newInstance(System.in);

        // Scanner sc = new Scanner(System.in) ;
        // int year = sc.nextInt() ;

        // 3.获取要调用的方法对象
        Method nextIntMethod = scannerClass.getMethod("nextInt");


        // 4.调用方法
        System.out.println("请输入年份：");
        int year = (int)nextIntMethod.invoke(sc);

        // 5.实现具体的功能
        if(year % 4 ==0 && year %100!=0 || year % 400==0) {
            System.out.println(year + "是润年");
        } else {
            System.out.println(year + "是平年");
        }

    }
}
