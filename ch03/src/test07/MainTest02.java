package test07;


import java.util.Arrays;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 实例化泛型类对象
        GenericTest<String> gt = new GenericTest<>() ;

        // 错误 - 泛型中的数据只是声明而已，并没有实例化
        // String[] arr = gt.getArr();
        // arr[0] = "你好" ;

        gt.createArr(String.class,3) ;
        String[] arr = gt.getArr();
        arr[0] = "你好" ;
        arr[1] = "我好" ;
        arr[2] = "大家好，才是真的好" ;

        System.out.println(Arrays.toString(arr));
    }
}
