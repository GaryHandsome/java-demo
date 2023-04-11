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
public class MainTest02 {
    public static void main(String[] args) {
        // 语法二：创建了一个表示 字符串 的 Optional 对象，此字符串的值为：Hello
        Optional<String> stringOptional = Optional.of("Hello");
        Optional<Integer> intOptional = Optional.of(100);

        // Integer it = new Integer(100) ;

        // API方法 - isPresent：判断 Optional 对象是否存在值
        boolean isExistStrValue = stringOptional.isPresent();
        boolean isExistIntValue = intOptional.isPresent();

        // true：表示存在值
        System.out.println(isExistStrValue);
        System.out.println(isExistIntValue);

        // API方法 - get：获取 Optional 对象包装的具体数据
        System.out.println(stringOptional.get());
        System.out.println(intOptional.get());

    }
}
