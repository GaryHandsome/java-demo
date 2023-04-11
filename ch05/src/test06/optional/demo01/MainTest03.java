package test06.optional.demo01;

import java.util.Optional;

/**
 * 概念：Optional是一个类似包装类的一个类 - 用于包装 T 类型或可能为Null的数据
 * 作用：可以避免空指针异常的出现 - 避免繁琐的判空操作，使代码更加简洁
 * 实例化对象：不能通过 new 来实例化 Optional对象，因为 Optional 构造方法是私有的
 *  Optional op = new Optional() - 错误
 *
 *  只能通过 Optional 提供的以下方法，实例化 Optional 对象
 *  在实例化 Optional 对象的同时，指定具体的数据
 *      Optional.empty()
 *      Optional.of()
 *      Optional.ofNullable()
 *
 *
 *
 * @Date 2023-04-11
 * @Author zqx
 */
public class MainTest03 {
    public static void main(String[] args) {
        // 语法二：创建了一个表示 null 的 Optional 对象 - 错误 - of方法只能创建非空的　Optional　对象
        // Optional<String> nullOptional = Optional.of(null);

        // 解决：使用语法一和语法三来创建
        // 语法一
        Optional<Object> emptyOptional1 = Optional.empty();

        // 语法三
        Optional<Object> emptyOptional2 = Optional.ofNullable(null);
        Optional<Double> doubleOptional = Optional.ofNullable(3.14);



    }
}
