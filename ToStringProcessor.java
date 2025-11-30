package LAB6;

import java.lang.reflect.Field;

/**
 * Обработчик аннотации {@link ToString}.
 * Формирует текстовое представление объекта.
 */
public class ToStringProcessor {

    /**
     * Создает строковое представление объекта,
     * учитывая аннотацию {@link ToString}.
     *
     * @param obj объект
     * @return строковое представление
     */
    public static String buildString(Object obj) {
        if (obj == null) return "null";

        Class<?> cls = obj.getClass();
        if (!cls.isAnnotationPresent(ToString.class)) return obj.toString();

        StringBuilder sb = new StringBuilder(cls.getSimpleName() + "{");
        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            ToString ann = field.getAnnotation(ToString.class);
            if (ann == null || ann.value() == ToString.Mode.YES) {
                try {
                    field.setAccessible(true);
                    sb.append(field.getName()).append("=")
                            .append(field.get(obj)).append("; ");
                } catch (Exception ignored) {}
            }
        }

        sb.append("}");
        return sb.toString();
    }
}