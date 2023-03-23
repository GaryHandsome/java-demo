package test10.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型协变 - 不支持添加元素
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 错误
        // List<Number> list = new ArrayList<Integer>() ;

        // 泛型协变
        List<? extends Number> list = new ArrayList<Integer>() ;

        // 错误
        // list.add(100) ;
    }
}
