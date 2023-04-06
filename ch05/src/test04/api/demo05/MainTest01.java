package test04.api.demo05;

import java.util.function.Function;

/**
 * Function<T,R>：是一个函数型接口 - 把 T 类型的数据转换为 R 类型的数据
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest01 {

    public static void change(String data,
                              Function<String, Integer> function) {
        Integer intData = function.apply(data);
        System.out.println("转换结果为：" + (intData + 1));
    }

    public static void main(String[] args) {
        // R apply(T t);
        change("100",(t)->Integer.parseInt(t)) ;
    }
}
