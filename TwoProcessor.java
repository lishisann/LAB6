package LAB6;

/**
 * Обработчик аннотации {@link Two}.
 */
public class TwoProcessor {

    /**
     * Выводит параметры аннотации {@link Two}.
     *
     * @param cls анализируемый класс
     */
    public static void process(Class<?> cls) {
        if (cls.isAnnotationPresent(Two.class)) {
            Two ann = cls.getAnnotation(Two.class);
            System.out.println("first = " + ann.first());
            System.out.println("second = " + ann.second());
        } else {
            System.out.println("Аннотации @Two нет.");
        }
    }
}