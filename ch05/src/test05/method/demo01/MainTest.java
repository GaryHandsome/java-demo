package test05.method.demo01;

import java.util.Comparator;

/**
 * 方法引用 ： 引用已经存在的方法，代替 Lambda 表达式，实现函数式接口中的抽象方法
 * <p>
 * 要求：
 *      方法引用的参数必须与函数式接口中的参数保持一致
 *      方法引用的返回值兼容即可，建议也保持一致
 *
 * @Date 2023-04-07
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 1.匿名内部类
        Comparator<Integer> comparator1 = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        } ;

        // 2.Lambda表达式 - int compare(T o1, T o2);
        Comparator<Integer> comparator2 = (o1, o2)->o1-o2 ;

        // 3.方法引用
        Comparator<Integer> comparator3 = Integer::compare;
    }
}
