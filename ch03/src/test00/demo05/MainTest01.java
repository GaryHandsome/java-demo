package test00.demo05;

import java.util.Arrays;

/**
 * System.arraycopy()的使用 - 扩容
 *
 * @Date 2023-03-24
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 源数组
        String[] arr = {"AA","BB","CC"} ;


        // 目标数组
        String[] newArr = new String[10] ;

        System.arraycopy(arr, 0, newArr, 0, arr.length) ;

        arr = newArr ;
        
        arr[3] = "DD" ;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
