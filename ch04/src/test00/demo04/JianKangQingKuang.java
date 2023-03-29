package test00.demo04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解 - 用于标记动物的健康情况 - 优、良、中、差
 *
 * @Date 2023-03-29
 * @Author zqx
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SuppressWarnings("all")
public @interface JianKangQingKuang {
    String value() ;
}
