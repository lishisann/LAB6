package LAB6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Обработчик аннотации {@link Invoke}.
 * Автоматически вызывает помеченные методы.
 */
public class InvokeProcessor {

    /**
     * Вызывает все методы объекта, помеченные {@link Invoke}.
     *
     * @param obj объект для анализа
     */
    public static void process(Object obj) {
        if (obj == null) {
            System.out.println("Ошибка: передан null-объект.");
            return;
        }

        Method[] methods = obj.getClass().getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.setAccessible(true);
                    method.invoke(obj);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    System.out.println("Ошибка вызова метода: " + e.getMessage());
                }
            }
        }
    }
}