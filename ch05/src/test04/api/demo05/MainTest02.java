package test04.api.demo05;

import java.util.function.Function;

/**
 * Function<T,R>：是一个函数型接口 - 把 T 类型的数据转换为 R 类型的数据
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest02 {

    /**
     * 定义两个 Function 接口，
     * 实现把一个 String 类型的数据转换为 Integer 类型的数据
     * 实现把一个 Integer 类型数据放大2倍后返回（转换为 Integer类型）
     *
     *
     * T - String
     * R - Integer
     *
     *
     * @param data
     * @param function1 把字符串转换为整型
     * @param function2 把整型数据放大2倍返回（整型）
     */
    public static void change(String data,
                              Function<String, Integer> function1,
                              Function<Integer, Integer> function2) {
        Integer intData = function1.andThen(function2).apply(data);
        System.out.println("转换的结果为：" + intData);
    }

    public static void main(String[] args) {
        // R apply(T t);
        change("100",(t)->Integer.parseInt(t),(t)->t*2);
    }
}
