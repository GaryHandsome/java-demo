package test05;

import java.lang.annotation.*;

/**
 * 标识注解 - 没有任何成员的注解
 *
 * @Date 2023-03-28
 * @Author zqx
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Flag {
}
