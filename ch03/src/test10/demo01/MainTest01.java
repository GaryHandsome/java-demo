package test10.demo01;

/**
 * @Date 2023-03-23
 * @Author zqx
 */
public class MainTest01 {
    public static void main(String[] args) {
        // 多态
        Animal pig = new Pig() ;

        // 数组是支持类型的协变
        Animal[] animals = new Pig[10] ;

        // 按道理，以下代码也应该是OK的，但实际上不行
        // 泛型类型是不变的 - 必须保持泛型类型的一致性
        // List<Animal> list = new ArrayList<Pig>() ;

        // 思考：如果希望泛型类型也能像数组一样，具有协变性，怎么办呢？ - 使用通配符
    }
}
