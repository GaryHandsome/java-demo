package test09.demo02;

/**
 * 类边界
 *
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest {
    public static void main(String[] args) {
        // 实例化泛型类对象
        // GenericTest<Integer> gt1 = new GenericTest<>();
        // GenericTest<Double> gt2 = new GenericTest<>();
        GenericTest<Animal> gt3 = new GenericTest<>();
        GenericTest<Pig> gt4 = new GenericTest<>();
        GenericTest<CartoonPig> gt5 = new GenericTest<>();



    }
}
