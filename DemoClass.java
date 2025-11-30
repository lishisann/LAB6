package LAB6;

/**
 * Демонстрационный класс для примера работы с аннотацией {@link Invoke}.
 */
public class DemoClass {

    /**
     * Метод, автоматически вызываемый {@link InvokeProcessor}.
     */
    @Invoke
    public void sayHello() {
        System.out.println("Метод sayHello() вызван автоматически!");
    }

    /**
     * Метод, вызываемый вручную.
     */
    public void sayBye() {
        System.out.println("Метод sayBye() вызван вручную.");
    }
}