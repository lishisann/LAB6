package LAB6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Аннотация для указания областей кеширования.
 * Может применяться к классу.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    /**
     * Список имен кешируемых областей.
     *
     * @return массив строк — названия областей кеша
     */
    String[] value() default {};
}