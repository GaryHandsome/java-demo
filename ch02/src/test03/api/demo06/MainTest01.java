package test03.api.demo06;

/**
 * 数组的传统使用
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 第一：创建数组
        // int[] arr = new int[3];

        // 第二：初始化数组
        // arr[0] = 100;
        // arr[1] = 200;
        //arr[2] = 300;

        // 在创建数组的同时，初始化数组
        int[] arr = {100,200,300} ;

        // 第三：使用数组（循环）
        System.out.println("第一个元素：" + arr[0]);
        System.out.println("第二个元素：" + arr[1]);
        System.out.println("第三个元素：" + arr[2]);
    }
}
