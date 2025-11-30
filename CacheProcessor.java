package LAB6;

/**
 * Обработчик аннотации {@link Cache}.
 */
public class CacheProcessor {

    /**
     * Выполняет обработку класса с аннотацией {@link Cache}.
     *
     * @param cls класс для анализа
     */
    public static void process(Class<?> cls) {
        if (cls.isAnnotationPresent(Cache.class)) {
            String[] arr = cls.getAnnotation(Cache.class).value();
            if (arr.length == 0) {
                System.out.println("Список кешируемых областей пуст.");
            } else {
                for (String s : arr) {
                    System.out.println("Кешируемая область: " + s);
                }
            }
        } else {
            System.out.println("Аннотации @Cache нет.");
        }
    }
}