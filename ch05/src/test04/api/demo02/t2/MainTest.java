package test04.api.demo02.t2;

import test04.api.demo02.t1.SupplierImpl;

import java.util.function.Supplier;

/**
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 接口 对象 = new 接口(){抽象方法的实现} ;
        Supplier<String> supplier = new Supplier<String>(){
            @Override
            public String get() {
                return "好好学习，天天向上";
            }
        };

        String msg = supplier.get();

        System.out.println(msg);
    }
}
