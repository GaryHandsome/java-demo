package test00.demo01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个注解，用于设置一个最小值 - 整数的成员
 *
 * @Date 2023-03-28
 * @Author zqx
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinData {
    /**
     * 用于设置一个整数值 - 以方法的方式定义
     *
     * @return
     */
    int value();
}
