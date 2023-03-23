package test08;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        People<Double> zs = new People<>();

        Pet<String> xh = new Pet<>() ;
        Pet<Double> xb = new Pet<>() ;

        zs.setPet(xh);

        // 错误 - 泛型类型不一致 - 泛型的不变性
        // xb 指定的是 Double类型，但 zs 对象封装的 Pet 指定的类型为 String
        // zs.setPet(xb);
    }
}
