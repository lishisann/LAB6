package LAB6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Аннотация для автоматического включения поля в строковое представление.
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {

    /**
     * Режим отображения поля.
     */
    Mode value() default Mode.YES;

    /**
     * Значения режима: включать или исключать поле.
     */
    enum Mode {
        YES, NO
    }
}