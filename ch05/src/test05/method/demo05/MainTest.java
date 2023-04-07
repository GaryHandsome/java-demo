package test05.method.demo05;

import java.util.Arrays;

/**
 * 测试
 *
 * @Date 2023-04-07
 * @Author zqx
 */
public class MainTest {
    /**
     * 构造一个指定长度的字符串数组
     *
     * @param len
     * @param ab
     */
    public static String[] build(int len, ArrayBuilder<String> ab) {
        return ab.create(len);
    }

    public static void main(String[] args) {
        // 1.通过匿名内部类实现
        String[] arr1 = build(3,new ArrayBuilder<String>(){
            @Override
            public String[] create(int len) {
                return new String[len];
            }
        }) ;

        arr1[0] = "aa" ;
        arr1[1] = "bb" ;
        arr1[2] = "cc" ;

        System.out.println(Arrays.toString(arr1));

        // 2.通过 Lambda表达式 实现 - T[] create(int len);
        String[] arr2 = build(3,(len)->new String[len]) ;
        arr2[0] = "ee" ;
        arr2[1] = "ff" ;
        arr2[2] = "gg" ;
        System.out.println(Arrays.toString(arr2));

        // 3.通过 方法引用 实现 - 数据类型[]::new
        String[] arr3 = build(3,String[]::new) ;
        arr3[0] = "hh" ;
        arr3[1] = "ii" ;
        arr3[2] = "jj" ;
        System.out.println(Arrays.toString(arr3));

    }
}
