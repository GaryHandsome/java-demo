package test00.demo03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解 - 用于设置学生的爱好以及允许性别可能的值
 *
 * @Date 2023-03-29
 * @Author zqx
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SetData {
    /**
     * 设置学生的爱好
     *
     * @return
     */
    String[] hobby();

    /**
     * 设置学生允许的性别值
     *
     * @return
     */
    String sex() default "男,man,m,male,1,true,女,woman,w,female,0,false";
}
