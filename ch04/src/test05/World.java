package test05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Date 2023-03-28
 * @Author zqx
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface World {
    Class aa() ;

    Hello bb() ;

    Week cc() ;

    String[] dd() ;

    // Student[] ee() ;
}
