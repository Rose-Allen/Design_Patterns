package Singleton;

public class Main {
    public static void main(String[] args) {
        CarManager manager1 = CarManager.getInstance();
        CarManager manager2 = CarManager.getInstance();
        System.out.println(manager1 == manager2);
        manager1.doSomething();
    }
}
