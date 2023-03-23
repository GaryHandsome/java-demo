package test00.demo03;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest02 {
    public static void main(String[] args) {
        // 实例化泛型类对象 - Tiger - 错误
        // Tiger不是IWenShun接口，也不是IWenShun接口的实现类
        // People<Tiger> zs = new People<>();
        People<Cat> zs = new People<>();

        Cat xh = new Cat("小花") ;

        zs.setPet(xh);
        zs.shopping();
    }
}
