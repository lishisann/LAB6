package LAB6;

/**
 * Обработчик аннотации {@link Default}.
 */
public class DefaultProcessor {

    /**
     * Обрабатывает аннотацию {@link Default} у указанного класса.
     *
     * @param cls анализируемый класс
     */
    public static void process(Class<?> cls) {
        if (cls.isAnnotationPresent(Default.class)) {
            Default d = cls.getAnnotation(Default.class);
            System.out.println("Класс по умолчанию: " + d.value().getName());
        } else {
            System.out.println("Аннотация @Default отсутствует.");
        }
    }
}