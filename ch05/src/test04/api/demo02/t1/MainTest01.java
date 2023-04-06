package test04.api.demo02.t1;

import java.util.function.Supplier;

/**
 * @Date 2023-04-06
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 接口 对象 = new 实现类() ;
        Supplier<String> supplier = new SupplierImpl();

        String msg = supplier.get();

        System.out.println(msg);
    }
}
