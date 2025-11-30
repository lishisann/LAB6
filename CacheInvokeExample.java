package LAB6;

/**
 * Класс, демонстрирующий совместное использование
 * аннотаций {@link Cache} и {@link Invoke}.
 */
@Cache({"users", "orders"})
public class CacheInvokeExample {

    /** Флаг, указывающий, был ли метод вызван. */
    public boolean invoked = false;

    /**
     * Метод, вызываемый автоматически при обработке аннотации {@link Invoke}.
     */
    @Invoke
    public void run() {
        invoked = true;
    }
}