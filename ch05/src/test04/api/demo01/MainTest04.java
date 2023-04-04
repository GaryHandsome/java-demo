package test04.api.demo01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Date 2023-04-04
 * @Author zqx
 */
public class MainTest04 {
    public static void main(String[] args) {
        // 定义整型数组
        Integer[] arr = {1,5,2,3,4} ;

        // 排序之前
        for (int data : arr) {
            System.out.print(data + " ");
        }

        // 排序 - 升充
        // Arrays.sort(arr);

        // 函数式接口使用方式三 - Lambda表达式 - int compare(T o1, T o2);
        Arrays.sort(arr,(o1, o2)->o2-o1);

        System.out.println();

        // 排序之后
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }
}
