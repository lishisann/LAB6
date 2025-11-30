package LAB6;

/**
 * Класс, демонстрирующий автоматическую генерацию строки {@link ToStringProcessor}.
 */
@ToString
public class Person {

    /** Имя пользователя. */
    public String name = "Alice";

    /** Пароль — исключен из вывода. */
    @ToString(ToString.Mode.NO)
    public String password = "12345";

    /** Возраст пользователя. */
    public int age = 25;
}