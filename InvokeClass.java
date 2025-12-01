package LAB6;

public class InvokeClass {

    @Invoke
    public void hello() {
        System.out.println("Invoke вызван.");
    }

    public void notInvoked() {
        System.out.println("Я не должен быть вызван.");
    }

    @Invoke
    private void secret() {
        System.out.println("Приватный invoke вызван.");
    }
}
