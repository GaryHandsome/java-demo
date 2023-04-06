package test04.api.demo02.t1;

import java.util.function.Supplier;

/**
 * 第一：定义接口的实现类 -
 *
 * SupplierImpl 是 Supplier接口 的实现类
 *
 * @Date 2023-04-06
 * @Author zqx
 */
public class SupplierImpl implements Supplier<String> {
    @Override
    public String get() {
        // 此处省略N行代码...
        return "好好学习，天天向上";
    }
}
