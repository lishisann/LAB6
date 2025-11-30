package LAB6;

/**
 * Обработчик аннотации {@link Validate}.
 */
public class ValidateProcessor {

    /**
     * Выводит список классов, указанных в аннотации {@link Validate}.
     *
     * @param cls анализируемый класс
     */
    public static void process(Class<?> cls) {
        if (cls.isAnnotationPresent(Validate.class)) {
            Class<?>[] classes = cls.getAnnotation(Validate.class).value();
            for (Class<?> c : classes) {
                System.out.println("Указан класс: " + c.getName());
            }
        } else {
            System.out.println("Аннотации @Validate нет.");
        }
    }
}