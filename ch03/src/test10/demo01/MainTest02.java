package test10.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 泛型协变 - 相当于使 <Pig> 成为了 <? extends Animal> 子类型
        List<? extends Animal> list = new ArrayList<Pig>() ;


    }
}
