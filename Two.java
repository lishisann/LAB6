package LAB6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Аннотация с двумя параметрами: строковым и числовым.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Two {

    /**
     * Первый параметр.
     */
    String first();

    /**
     * Второй параметр.
     */
    int second();
}