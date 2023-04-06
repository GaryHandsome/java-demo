package test04.api.demo02.t5;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * 函数式接口作为方法参数的使用
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {

    /**
     * 函数式接口作为方法参数的使用
     * <p>
     * 说明：函数式接口用在方法参数的目的是为了做一些封装，实现一些逻辑处理
     *
     * @param supplier
     */
    private static void getMax(Supplier<Integer> supplier) {
        // 1.获取 Supplier 接口生产的数据
        Integer maxData = supplier.get();

        // 2.对数据进行相关的逻辑处理...
        System.out.println("数组中最大的值为：" + maxData);
    }


    public static void main(String[] args) {
        Integer[] arr = {1,2,9,5,7,4} ;

        // 1.匿名内部类实现
        getMax(new Supplier<Integer>() {
            @Override
            public Integer get() {

                Integer maxData = arr[0] ;

                for (Integer data : arr) {
                    if(maxData < data) {
                        maxData = data ;
                    }
                }
                return maxData;
            }
        }) ;

        // 2.Lambda表达式 - T get();
        getMax(()->{
            // 升序
            Arrays.sort(arr);
            return arr[arr.length-1] ;
        }) ;

    }
}
