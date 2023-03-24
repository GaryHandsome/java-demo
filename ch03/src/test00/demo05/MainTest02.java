package test00.demo05;

import java.util.Arrays;

/**
 * System.arraycopy()的使用 - 删除数组某个元素
 *
 * @Date 2023-03-24
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 源数组
        String[] arr = {"AA","BB","CC","DD","EE"} ;

        // 1）把删除的元素后面所有的元素往前移
        int delIndex = 2 ;
        System.arraycopy(arr, delIndex+1, arr, delIndex, arr.length-delIndex-1) ;

        // 2）把最后一个元素设置为null
        arr[arr.length-1] = null ;
        String[] newArr = Arrays.copyOf(arr,arr.length-1) ;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

    }
}
