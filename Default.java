package LAB6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для указания класса по умолчанию.
 * Может применяться к классу или полю.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    /**
     * Класс, который должен использоваться по умолчанию.
     *
     * @return класс по умолчанию
     */
    Class<?> value();
}