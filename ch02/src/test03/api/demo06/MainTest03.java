package test03.api.demo06;

import java.lang.reflect.Array;

/**
 * 数组的反射操作
 *  第一：实例化数组对象
 *      Object arrObj = Array.newInstance(“数组数据类型的Class对象”, “长度”)  ;
 *
 *  第二：初始化数组
 *      Array.set(“数组对象” ,  ”下标索引” , “值”)  ;
 *
 *      Array.setXxx(“数组对象” ,  ”下标索引” , “值”)  ;
 *
 *
 *  第三：获取数组中的元素值
 *      Array.get(“数组对象” ,  ”下标索引” )  ;
 *      Array.getXxx(“数组对象” ,  ”下标索引” )  ;
 *
 *
 *  课堂练习：创建一个学生类型的数组，存放三个学生，循环遍历输出
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 第一：创建数组
        // int[] arr = new int[3];
        Object arrObj = Array.newInstance(int.class, 3)  ;

        // 第二：初始化数组
        Array.set(arrObj ,  0 , 100)  ;
        Array.set(arrObj ,  1 , 200)  ;
        Array.setInt(arrObj ,  2 , 300);  ;

        // 第三：使用数组（循环）
        Object oneValue = Array.get(arrObj, 0);
        Object twoValue = Array.get(arrObj, 1);
        int threeValue = Array.getInt(arrObj, 2);

        System.out.println("第一个元素：" + oneValue);
        System.out.println("第二个元素：" + twoValue);
        System.out.println("第三个元素：" + threeValue);
    }
}
