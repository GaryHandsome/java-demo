package test10.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型逆变 - 可以添加元素，但不能查询元素
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 使得 <Animal> 成为了 <? super Pig> 的子类型
        // 可以添加 Pig类型，及Pig类型的子类
        List<? super Pig> list = new ArrayList<Animal>();

        // 逆变可以添加元素
        list.add(new Pig()) ;
        list.add(new CartoonPig()) ;

        // 逆变不可以获取元素
        // Pig pig = list.get(0);
        Pig pig = (Pig)list.get(0);
        list.get(0) ;

    }
}
