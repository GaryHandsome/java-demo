package test03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 自定义注解 - HelloWorld
 *
 *  int[] arr = {1,2,3} ;
 *
 * @Date 2023-03-27
 * @Author zqx
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
public @interface HelloWorld {
}
