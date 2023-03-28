package test05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 如果成员的名称为 value，则在使用注解时，可以省略不写成员名称，而直接赋值即可
 *
 * @Date 2023-03-28
 * @Author zqx
 */
@Target(ElementType.TYPE)
public @interface Test {
    String value();
}
