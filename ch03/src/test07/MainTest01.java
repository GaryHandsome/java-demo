package test07;


import java.util.Arrays;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化泛型类对象
        GenericTest<String> gt = new GenericTest<>() ;

        // 定义数组
        String[] arr = {"AA","BB","CC"} ;

        // 填充数据
        gt.setArr(arr);

        // 获取泛型数组，并打印输出 - Arrays.toString()：转化为字符串
        System.out.println(Arrays.toString(gt.getArr()));

    }
}
