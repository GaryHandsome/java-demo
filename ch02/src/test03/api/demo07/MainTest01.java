package test03.api.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的基本操作
 *
 * @Date 2023-03-21
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 实例化一个List集合，并指定泛型
        // 注意：泛型只能在编译时有效
        List<String> list = new ArrayList<>() ;

        // 添加元素
        list.add("你好");
        list.add("我好");
        list.add("大家好，才是真的好");

        // 以下代码报错，因为已经通过泛型指定集合只能存储字符串类型数据
        // 字符串以外的数据是不能存储的 - 此约束只能作用在编译期
        // 如果我们跳过编译期，能否存储其它类型的数据呢 - 可以 - 反射 - 在运行时做一些处理
        // list.add(100) ;
    }
}
