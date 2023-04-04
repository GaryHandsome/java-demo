package test04.api.demo01;

import java.util.Arrays;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 定义整型数组
        int[] arr = {1,5,2,3,4} ;

        // 排序之前
        for (int data : arr) {
            System.out.print(data + " ");
        }

        // 排序 - 升充
        Arrays.sort(arr);

        System.out.println();

        // 排序之后
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}
