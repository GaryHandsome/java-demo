package test10.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型协变 - 不支持添加元素 ，但可以查询数据
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 泛型集合的不变性 - 赋值运行符左右两边的泛型保持一致
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(100);
        list.add(200);
        list.add(300);

        // 泛型协变
        List<? extends Number> numberList = list ;

        // 错误 - 注意：经过协变后的集合，不能添加元素
        // numberList.add(100) ;

        // 查询遍历数据
        for (Number number : numberList) {
            System.out.println(number);
        }



    }
}
