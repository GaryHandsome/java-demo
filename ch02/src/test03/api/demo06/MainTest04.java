package test03.api.demo06;

import java.lang.reflect.Array;

/**
 * 反射的多维数组操作
 * 第一：实例化多维数组
 * Object obj = Array.newInstance(数组数据类型的Class对象, [维数,...]) ;
 * <p>
 * Object obj = Array.newInstance(int.class, 3 , 4) ;
 * int[][] obj = new int[3][4] ;
 * <p>
 * Object obj = Array.newInstance(int.class, 3 , 4 , 7) ;
 * int[][][] obj = new int[3][4][7] ;
 * <p>
 * 第二：初始化多维数组 - 分别获取各维数组的引用
 * obj[1][3][6] = 100 ;
 * <p>
 * 1.获取第一维数组的引用 - obj[1][?]
 * Object oneArr = Array.get(obj, 1);
 * <p>
 * 2.获取第二维数组的引用 - obj[1][3][?]
 * Object twoArr = Array.get(oneArr, 3);
 * <p>
 * 3.赋值 - obj[1][3][6] = 100
 * Array.set(twoArr,6,100);
 * <p>
 * <p>
 * <p>
 * 第三：使用多维数组
 * Object data = Array.get(twoArr, 6);
 * System.out.println(data);
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) {
        // 第一：实例化三维数组 - int[][][] obj = new int[3][4][7] ;
        Object obj = Array.newInstance(int.class, 3, 4, 7);

        // 第二：初始化三维数组 - obj[1][2][5]
        // 1.获取第二维数组的引用 - obj[1][?]
        Object oneArr = Array.get(obj, 1);

        // 2.获取第三维数组的引用 - obj[1][2][?]
        Object twoArr = Array.get(oneArr, 2);

        // 3.赋值
        Array.set(twoArr, 4, 100);
        Array.set(twoArr, 5, 200);

        // 第三：使用三维数组
        Object data = Array.get(twoArr, 4);
        System.out.println(data);

        System.out.println("-----------------------");
        System.out.println("获取多维数组的长度");

        System.out.println("第一维的长度：" + Array.getLength(obj));
        System.out.println("第二维的长度：" + Array.getLength(oneArr));
        System.out.println("第三维的长度：" + Array.getLength(twoArr));
    }
}
