package test05;

import test03.HelloWorld;

import java.lang.annotation.*;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Hello {
    String msg() default "好好学习，天天向上";

    int maxData() ;
}
