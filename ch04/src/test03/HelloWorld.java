package test03;

import java.lang.annotation.*;

/**
 * 自定义注解 - HelloWorld
 *
 *  int[] arr = {1,2,3} ;
 *
 * @Date 2023-03-27
 * @Author zqx
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface HelloWorld {
}
